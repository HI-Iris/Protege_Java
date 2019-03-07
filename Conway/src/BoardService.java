import java.util.Scanner;

class BoardService {
    static String getValidBoardSizeByUserInput() {
        String userInput;
        do {
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isValid(userInput, ConstString.VALID_BOARD_SIZE, ConstString.MSG_INVALID_SIZE));
        return userInput;
    }

    static Board buildBoardByValidSize(String validSize) {
        String[] size = validSize.split("\\*");
        int numOfRows = Integer.parseInt(size[0]);
        int numOfColumns = Integer.parseInt(size[1]);
        return new Board(numOfRows, numOfColumns);
    }

    static Board initialBoardByUserInput(Board currentBoard) {
        String userInput = new Scanner(System.in).nextLine();
        int numOfRows = currentBoard.getNumOfRows();
        int numOfColumns = currentBoard.getNumOfColumns();
        Cell[][] cells = currentBoard.getCells();
        do {
            if ((Validation.isValid(userInput, ConstString.VALID_COORDS, ConstString.MSG_INVALID_COORDS)) && (Validation.isCoordsInRange(numOfRows, numOfColumns, userInput, ConstString.MSG_COORDS_OUT_OF_RANGE))) {
                String[] coords = userInput.split(" ");
                int rowIndex = Integer.parseInt(coords[0]) - 1;
                int columnIndex = Integer.parseInt(coords[1]) - 1;
                cells[rowIndex][columnIndex] = Cell.live;
            }
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isValid(userInput, ConstString.VALID_QUIT_CMD));
        return new Board(cells);
    }

    private static boolean isTopLeftCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex - 1 >= 0) && (yIndex - 1 >= 0) && (cells[xIndex - 1][yIndex - 1].name().equals("live"));
    }

    private static boolean isTopCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex - 1 >= 0) && (cells[xIndex - 1][yIndex].name().equals("live"));
    }

    private static boolean isTopRightCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex - 1 >= 0) && (yIndex + 1 < cells[0].length) && (cells[xIndex - 1][yIndex + 1].name().equals("live"));
    }

    private static boolean isRightCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (yIndex + 1 < cells[0].length) && (cells[xIndex][yIndex + 1].name().equals("live"));
    }

    private static boolean isBottomRightCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex + 1 < cells.length) && (yIndex + 1 < cells[0].length) && (cells[xIndex + 1][yIndex + 1].name().equals("live"));
    }

    private static boolean isBottomCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex + 1 < cells.length) && (cells[xIndex + 1][yIndex].name().equals("live"));
    }

    private static boolean isBottomLeftCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (xIndex + 1 < cells.length) && (yIndex - 1 >= 0) && (cells[xIndex + 1][yIndex - 1].name().equals("live"));
    }

    private static boolean isLeftCellLive(Cell[][] cells, int xIndex, int yIndex) {
        return (yIndex - 1 >= 0) && (cells[xIndex][yIndex - 1].name().equals("live"));
    }

    private static int getNumOfLiveNeighbourOfCurrentCell(Cell[][] cells, int xIndex, int yIndex) {
        int numOfLiveNeighbour = 0;
        if (isTopLeftCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isTopCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isTopRightCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isRightCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isBottomRightCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isBottomCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isBottomLeftCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        if (isLeftCellLive(cells, xIndex, yIndex)) {
            numOfLiveNeighbour += 1;
        }
        return numOfLiveNeighbour;
    }

    static Board nextGen(Board currentBoard) {
        Cell[][] nextGeneration = new Cell[currentBoard.getNumOfRows()][currentBoard.getNumOfColumns()];
        int numOfLiveNeighbour;
        for (int x = 0; x < currentBoard.getNumOfRows(); x++) {
            for (int y = 0; y < currentBoard.getNumOfColumns(); y++) {
                nextGeneration[x][y] = Cell.dead;
                numOfLiveNeighbour = BoardService.getNumOfLiveNeighbourOfCurrentCell(currentBoard.getCells(), x, y);
                if ((numOfLiveNeighbour >= 2) && (numOfLiveNeighbour <= 3) && (currentBoard.getCells()[x][y] == Cell.live)) {
                    nextGeneration[x][y] = Cell.live;
                }
                if ((numOfLiveNeighbour == 3) && (currentBoard.getCells()[x][y] == Cell.dead)) {
                    nextGeneration[x][y] = Cell.live;
                }
            }
        }
        return new Board(nextGeneration);
    }

    static int getNumOfLiveCellOnCurrentBoard(Board currentBoard) {
        int numOfLiveCell = 0;
        for (int x = 0; x < currentBoard.getNumOfRows(); x++) {
            for (int y = 0; y < currentBoard.getNumOfColumns(); y++) {
                if (currentBoard.getCells()[x][y] == Cell.live) {
                    numOfLiveCell += 1;
                }
            }
        }
        return numOfLiveCell;
    }
}

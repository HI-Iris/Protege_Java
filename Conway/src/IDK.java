import java.util.Scanner;

class IDK {
    static String getValidBoardSizeByUserInput() {
        System.out.println("Please set your board size x*y (e.g. 9*9)");
        String userInput;
        do {
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isValid(userInput, RegExp.VALID_BOARD_SIZE));
        return userInput;
    }

    static Board buildBoardByValidSize(String validSize) {
        System.out.println("\n*-*-*-*-*-*- Welcome to Conway's game of life! -*-*-*-*-*-*\n");
        String[] size = validSize.split("\\*");
        int numOfRows = Integer.parseInt(size[0]);
        int numOfColumns = Integer.parseInt(size[1]);
        return new Board(numOfRows, numOfColumns);
    }

    static void printCurrentBoard(Board currentBoard) {
        System.out.println("------------------------------------\n");
        for (int x = 0; x < currentBoard.getNumOfRows(); x++) {
            for (int y = 0; y < currentBoard.getNumOfColumns(); y++) {
                System.out.print(currentBoard.getCells()[x][y].status + "  ");
            }
            System.out.println();
        }
    }

    static Board initialBoardByUserInput(Board currentBoard) {
        System.out.println("\nPlease enter the coords (x y) of the live ceil to set the initial state of the world (e.g. 0 0), and enter 'Q' to finish: ");
        String userInput = new Scanner(System.in).nextLine();
        int numOfRows = currentBoard.getNumOfRows();
        int numOfColumns = currentBoard.getNumOfColumns();
        Cell[][] cells = currentBoard.getCells();
        do {
            if ((Validation.isValid(userInput, RegExp.VALID_COORDS)) && (Validation.isCoordsInRange(userInput, numOfRows, numOfColumns))) {
                String[] coords = userInput.split(" ");
                int rowIndex = Integer.parseInt(coords[0]);
                int columnIndex = Integer.parseInt(coords[1]);
                cells[rowIndex][columnIndex] = Cell.live;
            }
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isValid(userInput, RegExp.VALID_QUIT_CMD));
        return new Board(cells);
    }

    static int getNumOfLiveNeighbourOfCurrentCell(Cell[][] currentCell, int xIndex, int yIndex) {
        int numOfLiveNeighbour = 0;
        if ((xIndex - 1 >= 0) && (currentCell[xIndex - 1][yIndex].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((xIndex + 1 < currentCell.length) && (currentCell[xIndex + 1][yIndex].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((yIndex - 1 >= 0) && (currentCell[xIndex][yIndex - 1].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((yIndex + 1 < currentCell[0].length) && (currentCell[xIndex][yIndex + 1].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((xIndex - 1 >= 0) && (yIndex - 1 >= 0) && (currentCell[xIndex - 1][yIndex - 1].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((xIndex - 1 >= 0) && (yIndex + 1 < currentCell[0].length) && (currentCell[xIndex - 1][yIndex + 1].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((xIndex + 1 < currentCell.length) && (yIndex + 1 < currentCell[0].length) && (currentCell[xIndex + 1][yIndex + 1].name().equals("live"))) {
            numOfLiveNeighbour += 1;
        }
        if ((xIndex + 1 < currentCell.length) && (yIndex - 1 >= 0) && (currentCell[xIndex + 1][yIndex - 1].name().equals("live"))) {
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
                numOfLiveNeighbour = IDK.getNumOfLiveNeighbourOfCurrentCell(currentBoard.getCells(), x, y);
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

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

    static void printCurrentBoard(Board myBoard) {
        System.out.println("------------------------------------\n");
        for (int x = 0; x < myBoard.getNumOfRows(); x++) {
            for (int y = 0; y < myBoard.getNumOfColumns(); y++) {
                System.out.print(myBoard.getCells()[x][y].status + "  ");
            }
            System.out.println();
        }
    }

    static Board initialBoardByUserInput(Board myBoard) {
        System.out.println("\nPlease enter the coords (x y) of the live ceil to set the initial state of the world (e.g. 0 0), and enter 'Q' to finish: ");
        String userInput = new Scanner(System.in).nextLine();
        int numOfRows = myBoard.getNumOfRows();
        int numOfColumns = myBoard.getNumOfColumns();
        Cell[][] cells = myBoard.getCells();
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

    static int getTheNumOfLiveNeighbour(Cell[][] currentCell, int x, int y) {
        int numOfLiveNeighbour = 0;
        if ((currentCell[x - 1][y].name().equals("live")) && (x - 1 >= 0)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x + 1][y].name().equals("live")) && (x + 1 < currentCell.length)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x][y - 1].name().equals("live")) && (y - 1 >= 0)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x][y + 1].name().equals("live")) && (y + 1 < currentCell[0].length)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x - 1][y - 1].name().equals("live")) && (x - 1 >= 0) && (y - 1 >= 0)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x - 1][y + 1].name().equals("live")) && (x - 1 >= 0) && (y + 1 < currentCell[0].length)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x + 1][y + 1].name().equals("live")) && (x + 1 < currentCell.length) && (y + 1 < currentCell[0].length)) {
            numOfLiveNeighbour += 1;
        } else if ((currentCell[x + 1][y - 1].name().equals("live")) && (x + 1 < currentCell.length) && (y - 1 >= 0)) {
            numOfLiveNeighbour += 1;
        }
        return numOfLiveNeighbour;
    }
}

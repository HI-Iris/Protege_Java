class SysPrint {
    void printWelcomeMsg() {
        System.out.println("\n*-*-*-*-*- Welcome to Conway's game of life! -*-*-*-*-*\n");
    }

    void printSizeEnter() {
        System.out.println("Please set your board size x*y (e.g. 9*9)");
    }

    void printBoardSize() {
        System.out.println("\n*-*-*-*-*- This is the size of your board -*-*-*-*-*\n");
    }

    void printSizeInvalid() {
        System.out.println("Sorry, please enter a valid board size x*y (e.g. 9*9)");
    }

    void printSeparator(int generation, int numOfLifeCellOnBoard) {
        System.out.println("\n*-*-*-*-*- Generation: " + generation + " -*-*-*-*-*");
        System.out.println("Live cells on board: " + numOfLifeCellOnBoard + "\n");
    }

    void printCoordsEnter() {
        System.out.println("\nPlease enter the coords (x y) of the live ceil to set the initial world (e.g. 0 0), and enter 'Q' to finish: ");
    }

    void printCoordsOutOfRange() {
        System.out.println("Sorry, the coordinate you have entered is out of range.");
    }

    void printCoordsInvalid() {
        System.out.println("Sorry, please enter a valid coordinate x y (e.g. 5 6) ");
    }

    void printCurrentBoard(Board currentBoard) {
        for (int x = 0; x < currentBoard.getNumOfRows(); x++) {
            for (int y = 0; y < currentBoard.getNumOfColumns(); y++) {
                System.out.print(currentBoard.getCells()[x][y].status + "  ");
            }
            System.out.println();
        }
    }
}

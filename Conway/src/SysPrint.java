class SysPrint {
    void printMsg(String msg) {
        System.out.println(msg);
    }

    void printSeparator(int generation, int numOfLifeCellOnBoard) {
        System.out.println("\n*-*-*-*-*- Generation: " + generation + " -*-*-*-*-*");
        System.out.println("Live cells on board: " + numOfLifeCellOnBoard + "\n");
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

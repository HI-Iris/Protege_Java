class Board {
    private int numOfRows;
    private int numOfColumns;
    private Cell[][] cells;

    Board(int numOfRows, int numOfColumns) {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        this.cells = new Cell[numOfRows][numOfColumns];
        for (int x = 0; x < this.getNumOfRows(); x++) {
            for (int y = 0; y < this.getNumOfColumns(); y++) {
                this.getCells()[x][y] = Cell.dead;
            }
        }
    }

    Board(Cell[][] cells) {
        this.numOfRows = cells.length;
        this.numOfColumns = cells[0].length;
        this.cells = cells;
    }

    Cell[][] getCells() {
        return cells;
    }

    int getNumOfColumns() {
        return numOfColumns;
    }

    int getNumOfRows() {
        return numOfRows;
    }
}

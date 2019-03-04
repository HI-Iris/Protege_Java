public class Main {
    public static void main(String[] args) {
//        String validSize = IDK.getValidBoardSizeByUserInput();
//        Board emptyBoard = IDK.buildBoardByValidSize(validSize);
//        IDK.printCurrentBoard(emptyBoard);
//        Board firstGenBoard = IDK.initialBoardByUserInput(emptyBoard);
//        IDK.printCurrentBoard(firstGenBoard);

        Cell[][] cells = new Cell[][]{{Cell.live, Cell.live, Cell.dead}, {Cell.live, Cell.live, Cell.dead}, {Cell.live, Cell.live, Cell.dead}};
        Board currentBoard = new Board(cells);
        IDK.printCurrentBoard(currentBoard);
        Board nextGen = IDK.nextGen(currentBoard);
        IDK.printCurrentBoard(nextGen);

    }
}

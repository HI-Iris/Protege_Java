public class Main {
    public static void main(String[] args) {
        String validSize = IDK.getValidBoardSizeByUserInput();
        Board emptyBoard = IDK.buildBoardByValidSize(validSize);
        IDK.printCurrentBoard(emptyBoard);
        Board firstGenBoard = IDK.initialBoardByUserInput(emptyBoard);
        IDK.printCurrentBoard(firstGenBoard);
        Board nextGen = IDK.nextGen(firstGenBoard);
        IDK.printCurrentBoard(nextGen);
    }
}

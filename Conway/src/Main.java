public class Main {
    public static void main(String[] args) {
        String validSize = IDK.getValidBoardSizeByUserInput();
        Board emptyBoard = IDK.buildBoardByValidSize(validSize);
        IDK.printCurrentBoard(emptyBoard);
        Board firstGen = IDK.initialBoardByUserInput(emptyBoard);
        IDK.printCurrentBoard(firstGen);
        Board nextGen = IDK.nextGen(firstGen);
        IDK.printCurrentBoard(nextGen);
    }
}

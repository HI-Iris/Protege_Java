public class Main
{
    public static void main(String[] args)
    {
        String validSize = IDK.getValidBoardSizeByUserInput();
        Board myBoard = IDK.buildBoardByValidSize(validSize);
        IDK.printCurrentBoard(myBoard);
        Board firstGenBoard = IDK.initialBoardByUserInput(myBoard);
        IDK.printCurrentBoard(firstGenBoard);
    }
}

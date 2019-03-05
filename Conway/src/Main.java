import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SysPrint myPrinter = new SysPrint();
        List<Board> boardList = new ArrayList<>();
        myPrinter.printMsg(ConstString.MSG_WELCOME);
        myPrinter.printMsg(ConstString.MSG_ENTER_SIZE);
        String validSize = IDK.getValidBoardSizeByUserInput();
        Board emptyBoard = IDK.buildBoardByValidSize(validSize);
        myPrinter.printMsg(ConstString.MSG_SIZE);
        myPrinter.printCurrentBoard(emptyBoard);
        myPrinter.printMsg(ConstString.MSG_ENTER_COORDS);
        Board tempBoard = IDK.initialBoardByUserInput(emptyBoard);
        boardList.add(tempBoard);
        int numOfLiveCellOnBoard;
        do {
            int generation = boardList.size();
            tempBoard = boardList.get(generation - 1);
            numOfLiveCellOnBoard = IDK.getNumOfLiveCellOnCurrentBoard(tempBoard);
            myPrinter.printSeparator(generation, numOfLiveCellOnBoard);
            myPrinter.printCurrentBoard(tempBoard);
            boardList.add(IDK.nextGen(tempBoard));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (numOfLiveCellOnBoard != 0);


    }
}

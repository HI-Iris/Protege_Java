import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();
        SysPrint.printMsg(ConstString.MSG_WELCOME);
        SysPrint.printMsg(ConstString.MSG_ENTER_SIZE);
        String validSize = IDK.getValidBoardSizeByUserInput();
        Board emptyBoard = IDK.buildBoardByValidSize(validSize);
        SysPrint.printMsg(ConstString.MSG_SIZE);
        SysPrint.printCurrentBoard(emptyBoard);
        SysPrint.printMsg(ConstString.MSG_ENTER_COORDS);
        Board tempBoard = IDK.initialBoardByUserInput(emptyBoard);
        boardList.add(tempBoard);
        int numOfLiveCellOnBoard;
        do {
            int generation = boardList.size();
            tempBoard = boardList.get(generation - 1);
            numOfLiveCellOnBoard = IDK.getNumOfLiveCellOnCurrentBoard(tempBoard);
            SysPrint.printSeparator(generation, numOfLiveCellOnBoard);
            SysPrint.printCurrentBoard(tempBoard);
            boardList.add(IDK.nextGen(tempBoard));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (numOfLiveCellOnBoard != 0);


    }
}

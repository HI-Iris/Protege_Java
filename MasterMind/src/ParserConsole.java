import java.util.List;
import java.util.Scanner;

public class ParserConsole implements Parser {
    private ColorBuilder humanColorBuilder = new HumanColorBuilder();

    @Override
    public List<Color> getValidInput() {
        String userInput;
        List<Color> humanColor;
        do {
            userInput = new Scanner(System.in).nextLine();
            humanColor = humanColorBuilder.buildColor(userInput.split(" "));
        } while (!Validation.isFourColorList(humanColor));
        return humanColor;
    }

    @Override
    public void printMSG(String msg) {
        System.out.println(msg);
    }

    @Override
    public void printList(List list) {
        for (Result result : (Iterable<Result>) list) {
            System.out.print(result + " ");
        }
        if (list.size() == 0) {
            printMSG(Constants.MSG_COLOR_NO_MATCH);
        } else {
            printMSG("");
        }
    }
}

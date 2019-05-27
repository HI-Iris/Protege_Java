import Exceptions.GameMaxAttemptException;
import model.ColorBuilder;
import model.MasterColorBuilder;
import controller.MasterMindStarter;
import controller.Referee;
import model.Color;
import model.Constants;
import model.Result;
import service.Parser;
import service.ConsoleParser;
import java.util.List;

public class MasterMindApplication {
    public static void main(String[] args) {
        ColorBuilder masterColorBuilder = new MasterColorBuilder();
        List<Color> masterColors = masterColorBuilder.buildColor();
        MasterMindStarter starter = new MasterMindStarter(masterColors, new Referee());

        Parser gameParser = new ConsoleParser();
        gameParser.printMessage(Constants.MSG_WELCOME);
        List<Result> resultBlocks = null;

        while (!starter.winCheck()) {
            gameParser.printMessage(Constants.MSG_ENTER_COLOR);
            List<Color> humanColors = gameParser.getHumanColorFromInput();
            try {
                resultBlocks = starter.play(humanColors);
            } catch (GameMaxAttemptException e) {
                e.printStackTrace();
            }
            gameParser.printMessage(Constants.MSG_RESULT_CHECK);
            gameParser.printResultBlocks(resultBlocks);
        }
        // TODO: 4. The controller is won when reaches this point.
    }
}

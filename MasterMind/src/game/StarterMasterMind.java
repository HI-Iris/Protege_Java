package game;

import color.Color;
import color.ColorBuilder;
import color.MasterColorBuilder;
import service.Constants;
import service.Parser;
import service.ParserConsole;

import java.util.List;

public class StarterMasterMind{
    public void gameStart() {
        List<Color> humanColors;
        List<Result> resultBlocks;
        Parser parserConsole = new ParserConsole();
        Referee referee = new Referee();
        ColorBuilder masterColorBuilder = new MasterColorBuilder();
        List<Color> masterColors = masterColorBuilder.buildColor();
        int gameAttempts = 0;
        parserConsole.printMessage(Constants.MSG_WELCOME);
        do {
            if (gameAttempts == Constants.MAX_ATTEMPT) {
                parserConsole.printMessage(Constants.ERROR_TRY_OVER_60);
                break;
            }
            parserConsole.printMessage(Constants.MSG_ENTER_COLOR);
            humanColors = parserConsole.getValidInput();
            resultBlocks = referee.matchHumanColorWithMasterMind(humanColors, masterColors);
            parserConsole.printMessage(Constants.MSG_COLOR_CHECK);
            parserConsole.printResult(resultBlocks);
            gameAttempts += 1;
        } while (!Validation.areResultColorsAllBlack(resultBlocks));
    }
}

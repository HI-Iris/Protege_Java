import java.util.List;

public class StarterMasterMind implements Starter {
    @Override
    public void gameStart() {
        List<Color> humanColors;
        List<Result> resultColors;
        Parser parserConsole = new ParserConsole();
        GameRules referee = new GameRules();
        ColorBuilder masterColorBuilder = new MasterColorBuilder();
        List<Color> masterColors = masterColorBuilder.buildColor();
        int gameAttempts = 0;
        parserConsole.printMSG(Constants.MSG_WELCOME);
        do {
            parserConsole.printMSG(Constants.MSG_ENTER_COLOR);
            humanColors = parserConsole.getValidInput();
            resultColors = referee.check(humanColors, masterColors);
            parserConsole.printMSG(Constants.MSG_COLOR_CHECK);
            parserConsole.printList(resultColors);
            gameAttempts += 1;
            if (gameAttempts == Constants.MAX_ATTEMPT) {
                parserConsole.printMSG(Constants.ERROR_TRY_OVER_60);
                break;
            }
        } while (!Validation.areResultColorsAllBlack(resultColors));

    }
}

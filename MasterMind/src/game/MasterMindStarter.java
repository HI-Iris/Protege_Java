package game;

import Exceptions.GameMaxAttemptException;
import model.Color;
import model.Result;
import model.Constants;

import java.util.List;

public class MasterMindStarter {
    private Referee referee;
    private List<Color> masterColors;
    private int attempts;
    private boolean isWon;

    public MasterMindStarter(List<Color> masterColors, Referee referee) {
        this.referee = referee;
        this.masterColors = masterColors;
        this.attempts = 0;
        this.isWon = false;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean isWon() {
        return isWon;
    }

    public List<Result> play(List<Color> humanColors) throws GameMaxAttemptException {
        // play = 给一个命令， 你换我一个结果
        if (this.attempts == Constants.MAX_ATTEMPT) {
           throw new GameMaxAttemptException(Constants.ERROR_TRY_OVER_60);
        }
        this.attempts += 1;
        List<Result> newResult = referee.matchHumanColorWithMasterColor(humanColors, this.masterColors);
        this.isWon = Validation.areResultColorsAllBlack(newResult);
        return newResult;
    }

//    public void gameStart() {
//        List<Color> humanColors;
//        List<Result> resultBlocks;
//        ColorBuilder masterColorBuilder = new MasterColorBuilder();
//        List<Color> masterColors = masterColorBuilder.buildColor();
//        int gameAttempts = 0;
//        parser.printMessage(Constants.MSG_WELCOME);
//            if (gameAttempts == Constants.MAX_ATTEMPT) {
//        do {
//                parser.printMessage(Constants.ERROR_TRY_OVER_60);
//                break;
//            }
//            parser.printMessage(Constants.MSG_ENTER_COLOR);
//            humanColors = parser.getValidInput();
//
//            resultBlocks = referee.matchHumanColorWithMasterColor(humanColors, masterColors);
//
//            parser.printMessage(Constants.MSG_COLOR_CHECK);
//            parser.printResult(resultBlocks);
//            gameAttempts += 1;
//        } while (!Validation.areResultColorsAllBlack(resultBlocks));
//    }
}

package game;

import model.Color;
import model.Result;
import model.Constants;
import service.ParserConsole;

import java.util.List;

public class Validation {

    public static boolean isColorListLengthFour(List<Color> colorList) {
        if (colorList.size() > Constants.NUM_OF_COLOR_IN_GAME) {
            new ParserConsole().printMessage(Constants.ERROR_INVALID_LENGTH);
        }
        if (colorList.size() < Constants.NUM_OF_COLOR_IN_GAME) {
            new ParserConsole().printMessage(Constants.ERROR_INVALID_COLOR);
        }
        return colorList.size() == Constants.NUM_OF_COLOR_IN_GAME;
    }

    public static boolean areResultColorsAllBlack(List<Result> resultColors) {
        if (areAllResultBlocksSame(resultColors) && isFirstColorInCorrectPosition(resultColors)){
            new ParserConsole().printMessage(Constants.MSG_WIN);
            return true;
        }
        return false;
    }

    private static boolean isFirstColorInCorrectPosition(List<Result> resultColors) {
        return resultColors.get(0) == Result.Black;
    }

    private static boolean areAllResultBlocksSame(List<Result> resultColors) {
        return resultColors.size() == Constants.NUM_OF_COLOR_IN_GAME && resultColors.stream().distinct().limit(2).count() <= 1;
    }


}

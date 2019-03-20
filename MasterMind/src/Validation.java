import java.util.List;

class Validation {

    static boolean isFourColorList(List<Color> colorList) {
        boolean flag = colorList.size() == Constants.NUM_OF_COLOR_IN_GAME;
        if (colorList.size() > Constants.NUM_OF_COLOR_IN_GAME) {
            new ParserConsole().printMSG(Constants.ERROR_INVALID_LENGTH);
        }
        if (colorList.size() < Constants.NUM_OF_COLOR_IN_GAME) {
            new ParserConsole().printMSG(Constants.ERROR_INVALID_COLOR);
        }
        return flag;
    }

    static boolean areResultColorsAllBlack(List<Result> resultColors) {
        return !resultColors.isEmpty() && resultColors.stream().distinct().limit(2).count() <= 1 && resultColors.get(0) != Result.White;
    }

    static void isAttemptsOver60(int attempts){
        if(attempts<Constants.MAX_ATTEMPT){
            new ParserConsole().printMSG(Constants.MSG_WIN);
        }else new ParserConsole().printMSG(Constants.ERROR_TRY_OVER_60);
    }
}

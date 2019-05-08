package model;

public class Constants {
    public static final String ERROR_INVALID_COLOR = "Error: you have given an invalid colour!";
    public static final String ERROR_INVALID_LENGTH = "Error: you must pass 4 colours!";
    public static final String ERROR_TRY_OVER_60 = "Error: you have had more than 60 tries!";

    public static final String MSG_WIN = "You won!";
    public static final String MSG_WELCOME = "Welcome to the Master Mind Game\nThe Master Mind has selected four colors from Red, Blue, Green, Orange, Purple and Yellow!";
    public static final String MSG_ENTER_COLOR = "Please select 4 colors from the list above, separate by a space";
    public static final String MSG_COLOR_CHECK = "Here is the result:";
    public static final String MSG_COLOR_NO_MATCH = "The colors you entered doesn't match any.";

    public static final int NUM_OF_COLOR_IN_GAME = 4;
    public static final int NUM_OF_COLOR_IN_TOTAL = 6;
    public static final int MAX_ATTEMPT = 60;
}

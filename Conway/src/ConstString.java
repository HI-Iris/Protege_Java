class ConstString {
    static final String VALID_BOARD_SIZE = "^[0-9]+\\*[0-9]+$";
    static final String VALID_COORDS = "^[0-9]+\\s[0-9]+$";
    static final String VALID_QUIT_CMD = "^[Qq]$";
    static final String MSG_WELCOME = "\n*-*-*-*-*- Welcome to the Conway's game of life-*-*-*-*-*\n";
    static final String MSG_ENTER_SIZE = "Please set the size of your board by type in x*y (e.g. 9*9)";
    static final String MSG_SIZE = "\n*-*-*-*-*- This is the size of your board -*-*-*-*-*\n";
    static final String MSG_INVALID_SIZE = "Sorry, please enter a valid board size x*y (e.g. 9*9)";
    static final String MSG_ENTER_COORDS = "\nPlease enter the coords (x y) of the live ceil to set the initial world (e.g. 0 0), and enter 'Q' to finish: ";
    static final String MSG_INVALID_COORDS = "Sorry, please enter a valid coordinate x y (e.g. 5 6) ";
    static final String MSG_COORDS_OUT_OF_RANGE = "Sorry, the coordinate you have entered is out of range. Please try again.";
}

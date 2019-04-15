import junit.framework.TestCase;

public class ValidationTest extends TestCase {
    public void testValidBoardSize() {
        String validBoardSize = "6*8";
        assertTrue(Validation.isValid(validBoardSize, ConstString.VALID_BOARD_SIZE));
    }
    public void testZero() {
        String validBoardSize = "0*0";
        assertFalse(Validation.isValid(validBoardSize, ConstString.VALID_BOARD_SIZE));
    }
    public void testThousand() {
        String validBoardSize = "1000*1000";
        assertTrue(Validation.isValid(validBoardSize, ConstString.VALID_BOARD_SIZE));
    }
    public void test09() {
        String validBoardSize = "09*09";
        assertFalse(Validation.isValid(validBoardSize, ConstString.VALID_BOARD_SIZE));
    }
    public void testInvalidBoardSize() {
        String invalidBoardSize = "*";
        assertFalse(Validation.isValid(invalidBoardSize, ConstString.VALID_BOARD_SIZE));
    }

    public void testValidCoords() {
        String validCoords = "6 8";
        assertTrue(Validation.isValid(validCoords, ConstString.VALID_COORDS));
    }
    public void testInvalidCoords() {
        String invalidCoords = "this is invalid";
        assertFalse(Validation.isValid(invalidCoords, ConstString.VALID_COORDS));
    }

    public void testValidCommandQuit() {
        String validQuitCmd = "q";
        assertTrue(Validation.isValid(validQuitCmd, ConstString.VALID_QUIT_CMD));
    }
    public void testInvalidCommand() {
        String invalidQuit = "this is invalid";
        assertFalse(Validation.isValid(invalidQuit, ConstString.VALID_QUIT_CMD));
    }

    public void testCoordsOutOfRange() {
        String coordsOutOfRange = "4 99";
        int numOfRows = 5;
        int numOfColumns = 5;
        assertFalse(Validation.isCoordsInRange(numOfRows, numOfColumns, coordsOutOfRange, ConstString.MSG_COORDS_OUT_OF_RANGE));
    }

}
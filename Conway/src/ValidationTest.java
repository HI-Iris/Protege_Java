import junit.framework.TestCase;

public class ValidationTest extends TestCase {
    public void testValidBoardSize() {
        String validBoardSize ="6*8";
        assertTrue(Validation.isValid(validBoardSize, RegExp.VALID_BOARD_SIZE));
    }
    public void testInvalidBoardSize() {
        String invalidBoardSize ="*";
        assertFalse(Validation.isValid(invalidBoardSize, RegExp.VALID_BOARD_SIZE));
    }
    public void testValidCoords() {
        String validCoords ="6 8";
        assertTrue(Validation.isValid(validCoords, RegExp.VALID_COORDS));
    }
    public void testInvalidCoords() {
        String  invalidCoords= "this is invalid";
        assertFalse(Validation.isValid(invalidCoords, RegExp.VALID_COORDS));
    }
    public void testValidCommandQuit() {
        String validQuitCmd ="q";
        assertTrue(Validation.isValid(validQuitCmd, RegExp.VALID_QUIT_CMD));
    }
    public void testInvalidCommand() {
        String  invalidQuit= "this is invalid";
        assertFalse(Validation.isValid(invalidQuit, RegExp.VALID_QUIT_CMD));
    }


}
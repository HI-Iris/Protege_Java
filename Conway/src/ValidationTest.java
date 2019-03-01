import junit.framework.TestCase;

public class ValidationTest extends TestCase {
    public void testValidBoardSize() {
        String validBoardSize ="6*8";
        assertTrue(Validation.isValidBoardSize(validBoardSize));
    }
    public void testVInvalidBoardSize() {
        String invalidBoardSize ="*";
        assertFalse(Validation.isValidBoardSize(invalidBoardSize));
    }

    public void testValidCommandCoord() {
        String validCommandCoord ="6 8";
        assertTrue(Validation.isValidCoord(validCommandCoord));
    }
    public void testValidCommandQuit() {
        String validCommandQuit ="q";
        assertTrue(Validation.isValidCoord(validCommandQuit));
    }
    public void testInvalidCommand() {
        String  invalidCommand= "this is invalid";
        assertFalse(Validation.isValidCoord(invalidCommand));
    }


}
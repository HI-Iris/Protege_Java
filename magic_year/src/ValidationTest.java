import junit.framework.TestCase;

public class ValidationTest extends TestCase {
    public void testIsNum() {
        String num = "123";
        assertTrue(Validation.isNum(num));
    }

    public void testNotNum() {
        String notNum = "this is not a number";
        assertFalse(Validation.isNum(notNum));
    }
}
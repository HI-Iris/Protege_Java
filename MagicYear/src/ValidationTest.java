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

    public void testIsFlag() {
        String flag = "yes";
        assertTrue(Validation.isFlag(flag));
    }

    public void testNotFlag() {
        String notFlag = "this is not a flag";
        assertFalse(Validation.isFlag(notFlag));
    }
}
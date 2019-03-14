import org.junit.Test;

import static org.junit.Assert.*;


public class ValidationTest {
    @Test
    public void testInputIsColor() {
        String colorRed = "Red";
        assertTrue(Validation.isColor(colorRed));
    }

    @Test
    public void testInputIsNotColor() {
        String notColor = "This is not a color";
        assertFalse(Validation.isColor(notColor));
    }

}

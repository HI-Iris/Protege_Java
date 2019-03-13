import org.junit.Test;

import static org.junit.Assert.*;

public class MasterMindTest {
    @Test
    public void testRandom() throws Exception {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        for (int i = 0; i < 3000; i++) {
            int result = MasterMind.randomNum();
            switch (result) {
                case 0:
                    num0 += 1;
                    break;
                case 1:
                    num1 += 1;
                    break;
                case 2:
                    num2 += 1;
                    break;
                case 3:
                    num3 += 1;
                    break;
                case 4:
                    num4 += 1;
                    break;
                case 5:
                    num5 += 1;
                    break;

            }
            assertTrue(result < 6 && result >= 0);
        }
        System.out.println(num0);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num4);
        System.out.println(num3);
        System.out.println(num5);
    }

    @Test
    public void testColor() {
        Color myColor = Color.Blue;
        System.out.println(myColor);
    }

}

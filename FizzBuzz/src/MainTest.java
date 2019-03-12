import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testInput100OutputBuzz() {
        int num=100;
        assertEquals("Buzz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput1Output1() {
        int num=1;
        assertEquals("1", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput3OutputFizz() {
        int num=3;
        assertEquals("Fizz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput5OutputBuzz() {
        int num=5;
        assertEquals("Buzz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput33OutputFizz() {
        int num=33;
        assertEquals("Fizz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput55OutputBuzz() {
        int num=55;
        assertEquals("Buzz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput15OutputFizzBuzz() {
        int num=15;
        assertEquals("FizzBuzz", Main.generateFizzBuzz(num));
    }

    @Test
    public void testInput75OutputFizzBuzz() {
        int num=75;
        assertEquals("FizzBuzz", Main.generateFizzBuzz(num));
    }
}
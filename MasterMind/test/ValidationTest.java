import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ValidationTest {
    private List<Color> colorList;
    private List<Result> resultColors;

    @Test
    public void givenFourColorListReturnTrue() {
        this.colorList = new ArrayList<>();
        colorList.add(Color.Red);
        colorList.add(Color.Blue);
        colorList.add(Color.Yellow);
        colorList.add(Color.Purple);
        assertTrue(Validation.isFourColorList(colorList));
    }

    @Test
    public void givenTwoColorListReturnFalse() {
        this.colorList = new ArrayList<>();
        colorList.add(Color.Red);
        colorList.add(Color.Blue);
        assertFalse(Validation.isFourColorList(colorList));
    }

    @Test
    public void givenFourWhiteReturnFalse(){
        this.resultColors = new ArrayList<>();
        resultColors.add(Result.White);
        resultColors.add(Result.White);
        resultColors.add(Result.White);
        resultColors.add(Result.White);
        assertFalse(Validation.areResultColorsAllBlack(resultColors));
    }

    @Test
    public void givenFourBlackReturnTrue(){
        this.resultColors = new ArrayList<>();
        resultColors.add(Result.Black);
        resultColors.add(Result.Black);
        resultColors.add(Result.Black);
        resultColors.add(Result.Black);
        assertTrue(Validation.areResultColorsAllBlack(resultColors));
    }

    @Test
    public void givenTwoBlackTwoWhiteReturnFalse(){
        this.resultColors = new ArrayList<>();
        resultColors.add(Result.Black);
        resultColors.add(Result.Black);
        resultColors.add(Result.White);
        resultColors.add(Result.White);
        assertFalse(Validation.areResultColorsAllBlack(resultColors));
    }

    @Test
    public void givenTwoBlackReturnFalse(){
        this.resultColors = new ArrayList<>();
        resultColors.add(Result.Black);
        resultColors.add(Result.Black);
        assertFalse(Validation.areResultColorsAllBlack(resultColors));
    }
}

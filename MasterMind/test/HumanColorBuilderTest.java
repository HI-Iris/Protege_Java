import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class HumanColorBuilderTest {
    private HumanColorBuilder humanColorBuilder;
    private List<Color> expectedColor;
    private List<Color> resultColor;

    @Test
    public void givenStringRedReturnColorArrayRed() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Red"});
        expectedColor.add(Color.Red);
        assertThat(resultColor, equalTo(expectedColor));
    }
//
//    @Test
//    public void givenStringBlueReturnColorArrayBlue() {
//        String[] userInput = {"Blue"};
//        Color[] expectedColor = {Color.Blue};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
//
//    @Test
//    public void givenStringYellowReturnColorArrayYellow() {
//        String[] userInput = {"Yellow"};
//        Color[] expectedColor = {Color.Yellow};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
//
//    @Test
//    public void givenStringGreenReturnColorArrayGreen() {
//        String[] userInput = {"Green"};
//        Color[] expectedColor = {Color.Green};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
//
//    @Test
//    public void givenStringPurpleReturnColorArrayPurple() {
//        String[] userInput = {"Purple"};
//        Color[] expectedColor = {Color.Purple};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
//
//    @Test
//    public void givenStringOrangeReturnColorArrayOrange() {
//        String[] userInput = {"Orange"};
//        Color[] expectedColor = {Color.Orange};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
//
//    @Test
//    public void givenStringArrayFourPurpleReturnColorArrayFourPurple() {
//        String[] userInput = {"Purple", "Purple", "Purple", "Purple"};
//        Color[] expectedColor = {Color.Purple, Color.Purple, Color.Purple, Color.Purple};
//        Color[] resultColor = humanColorBuilder.buildColor(userInput);
//        assertArrayEquals(expectedColor, resultColor);
//    }
}
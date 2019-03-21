import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class GameRuleTest {
    private List<Color> masterColors;
    private List<Color> humanColors;
    private List<Result> resultColors;
    private List<Result> expectedColors;
    private GameRules referee = new GameRules();

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        this.expectedColors= new ArrayList<>();
        expectedColors.add(Result.Black);
        this.resultColors = referee.check(humanColors, masterColors);
        assertThat(resultColors, equalTo(expectedColors));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedColors = new ArrayList<>();
        expectedColors.add(Result.Black);
        expectedColors.add(Result.Black);
        this.resultColors = referee.check(humanColors, masterColors);
        assertThat(resultColors, equalTo(expectedColors));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedColors = new ArrayList<>();
        expectedColors.add(Result.White);
        expectedColors.add(Result.White);
        this.resultColors = referee.check(humanColors, masterColors);
        assertThat(resultColors, equalTo(expectedColors));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Blue);
        humanColors.add(Color.Blue);
        this.expectedColors = new ArrayList<>();
        expectedColors.add(Result.Black);
        expectedColors.add(Result.White);
        this.resultColors = referee.check(humanColors, masterColors);
        assertThat(resultColors, equalTo(expectedColors));
    }

    @Test
    public void givenRedRedRedBlueWithRedRedBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Red);
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        humanColors.add(Color.Red);
        this.expectedColors = new ArrayList<>();
        expectedColors.add(Result.Black);
        expectedColors.add(Result.Black);
        expectedColors.add(Result.White);
        expectedColors.add(Result.White);
        this.resultColors = referee.check(humanColors, masterColors);
        assertThat(resultColors, equalTo(expectedColors));
    }
}

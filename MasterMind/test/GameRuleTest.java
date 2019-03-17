import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class GameRuleTest {
    private MasterMind masterMind;
    private List<Color> masterColors;
    private List<Color> humanColors;

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        this.masterMind = new MasterMind(masterColors);
        List<Result> result = GameRules.match(humanColors, masterMind);
        List<Result> expected = new ArrayList<>();
        expected.add(Result.Black);
        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.masterMind = new MasterMind(masterColors);
        List<Result> result = GameRules.match(humanColors, masterMind);
        List<Result> expected = new ArrayList<>();
        expected.add(Result.Black);
        expected.add(Result.Black);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.masterMind = new MasterMind(masterColors);
        List<Result> result = GameRules.match(humanColors, masterMind);
        List<Result> expected = new ArrayList<>();
        expected.add(Result.White);
        expected.add(Result.White);

        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Blue);
        humanColors.add(Color.Blue);
        this.masterMind = new MasterMind(masterColors);
        List<Result> result = GameRules.match(humanColors, masterMind);
        List<Result> expected = new ArrayList<>();
        expected.add(Result.Black);
        expected.add(Result.White);
        assertThat(result, equalTo(expected));
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
        this.masterMind = new MasterMind(masterColors);
        List<Result> result = GameRules.match(humanColors, masterMind);
        List<Result> expected = new ArrayList<>();
        expected.add(Result.Black);
        expected.add(Result.Black);
        expected.add(Result.White);
        expected.add(Result.White);
        assertThat(result, equalTo(expected));
    }
}

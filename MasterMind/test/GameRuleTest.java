import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GameRuleTest {
    private MasterMind masterMind;

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        Color[] masterColors = {Color.Red};
        this.masterMind = new MasterMind(masterColors);
        Color[] humanInput = {Color.Red};
        Result[] result = GameRules.match(humanInput, masterMind);
        Result[] expected = {Result.Black};
        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        Color[] masterColors = {Color.Red, Color.Blue};
        this.masterMind = new MasterMind(masterColors);
        Color[] humanInput = {Color.Red, Color.Blue};
        Result[] result = GameRules.match(humanInput, masterMind);
        Result[] expected = {Result.Black, Result.Black};
        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        Color[] masterColors = {Color.Blue, Color.Red};
        this.masterMind = new MasterMind(masterColors);
        Color[] humanInput = {Color.Red, Color.Blue};
        Result[] result = GameRules.match(humanInput, masterMind);
        Result[] expected = {Result.White, Result.White};
        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        Color[] masterColors = {Color.Blue, Color.Red};
        this.masterMind = new MasterMind(masterColors);
        Color[] humanInput = {Color.Blue, Color.Blue};
        Result[] result = GameRules.match(humanInput, masterMind);
        Result[] expected = {Result.Black, Result.White};
        assertThat(result, equalTo(expected));
    }

    @Test
    public void givenRedRedRedBlueWithRedRedBlueRedInputShouldReturnWhiteWhite() {
        Color[] masterColors = {Color.Red, Color.Red, Color.Red, Color.Blue};
        this.masterMind = new MasterMind(masterColors);
        Color[] humanInput = {Color.Red, Color.Red, Color.Blue, Color.Red};
        Result[] result = GameRules.match(humanInput, masterMind);
        Result[] expected = {Result.Black, Result.Black, Result.White, Result.White};
        assertThat(result, equalTo(expected));
    }
}

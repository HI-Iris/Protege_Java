import com.myob.iris.model.Color;
import com.myob.iris.controller.ColorMatcher;
import com.myob.iris.model.Result;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class ColorMatcherTest {
    private List<Color> masterColors;
    private List<Color> humanColors;
    private List<Result> resultBlocks;
    private List<Result> expectedBlocks;
    private ColorMatcher colorMatcher = new ColorMatcher();

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        this.expectedBlocks = new ArrayList<>();
        expectedBlocks.add(Result.Black);
        this.resultBlocks = colorMatcher.matchHumanColorWithMasterColor(humanColors, masterColors);
        assertThat(resultBlocks, equalTo(expectedBlocks));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedBlocks = new ArrayList<>();
        expectedBlocks.add(Result.Black);
        expectedBlocks.add(Result.Black);
        this.resultBlocks = colorMatcher.matchHumanColorWithMasterColor(humanColors, masterColors);
        assertThat(resultBlocks, equalTo(expectedBlocks));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedBlocks = new ArrayList<>();
        expectedBlocks.add(Result.White);
        expectedBlocks.add(Result.White);
        this.resultBlocks = colorMatcher.matchHumanColorWithMasterColor(humanColors, masterColors);
        assertThat(resultBlocks, equalTo(expectedBlocks));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Blue);
        humanColors.add(Color.Blue);
        this.expectedBlocks = new ArrayList<>();
        expectedBlocks.add(Result.Black);
        expectedBlocks.add(Result.White);
        this.resultBlocks = colorMatcher.matchHumanColorWithMasterColor(humanColors, masterColors);
        assertThat(resultBlocks, equalTo(expectedBlocks));
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
        this.expectedBlocks = new ArrayList<>();
        expectedBlocks.add(Result.Black);
        expectedBlocks.add(Result.Black);
        expectedBlocks.add(Result.White);
        expectedBlocks.add(Result.White);
        this.resultBlocks = colorMatcher.matchHumanColorWithMasterColor(humanColors, masterColors);
        assertThat(resultBlocks, equalTo(expectedBlocks));
    }
}

import color.Color;
import color.HumanColorBuilder;
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
    public void givenListStringRedReturnListColorRed() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Red"});
        expectedColor.add(Color.Red);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringBlueReturnListColorBlue() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Blue"});
        expectedColor.add(Color.Blue);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringYellowReturnListColorYellow() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Yellow"});
        expectedColor.add(Color.Yellow);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringGreenReturnListColorGreen() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Green"});
        expectedColor.add(Color.Green);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringPurpleReturnListColorPurple() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Purple"});
        expectedColor.add(Color.Purple);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringOrangeReturnListColorOrange() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Orange"});
        expectedColor.add(Color.Orange);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenListStringFourPurpleReturnListColorFourPurple() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Purple","Purple","Purple","Purple"});
        expectedColor.add(Color.Purple);
        expectedColor.add(Color.Purple);
        expectedColor.add(Color.Purple);
        expectedColor.add(Color.Purple);
        assertThat(resultColor, equalTo(expectedColor));
    }
}
package com.myob.iris.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HumanColorBuilderTest {
    private HumanColorBuilder humanColorBuilder;
    private List<Color> expectedColor;
    private List<Color> resultColor;

    @Test
    public void givenStringRedReturnListColorRed() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Red"});
        expectedColor.add(Color.Red);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringBlueReturnListColorBlue() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Blue"});
        expectedColor.add(Color.Blue);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringYellowReturnListColorYellow() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Yellow"});
        expectedColor.add(Color.Yellow);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringGreenReturnListColorGreen() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Green"});
        expectedColor.add(Color.Green);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringPurpleReturnListColorPurple() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Purple"});
        expectedColor.add(Color.Purple);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringOrangeReturnListColorOrange() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Orange"});
        expectedColor.add(Color.Orange);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringFourPurpleReturnListColorFourPurple() {
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

    @Test
    public void givenStringTwoPurpleAndTwoLettersReturnListColorTwoPurple() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"Purple","Purple","a","a"});
        expectedColor.add(Color.Purple);
        expectedColor.add(Color.Purple);
        assertThat(resultColor, equalTo(expectedColor));
    }

    @Test
    public void givenStringFourLettersReturnEmptyList() {
        this.humanColorBuilder = new HumanColorBuilder();
        this.expectedColor = new ArrayList<>();
        this.resultColor = new ArrayList<>();
        resultColor = humanColorBuilder.buildColor(new String[]{"a","b","c","d"});
        assertThat(resultColor, equalTo(expectedColor));
    }
}
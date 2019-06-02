package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.MatchElement;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class ColorMatcherTest {
    private List<Color> masterColors;
    private List<Color> humanColors;
    private List<MatchElement> actualMatchElement;
    private List<MatchElement> expectedMatchElement;
    private ColorMatcher colorMatcher = new ColorMatcher();

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        this.expectedMatchElement = new ArrayList<>();
        expectedMatchElement.add(MatchElement.Black);
        this.actualMatchElement = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchElement, equalTo(expectedMatchElement));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedMatchElement = new ArrayList<>();
        expectedMatchElement.add(MatchElement.Black);
        expectedMatchElement.add(MatchElement.Black);
        this.actualMatchElement = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchElement, equalTo(expectedMatchElement));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedMatchElement = new ArrayList<>();
        expectedMatchElement.add(MatchElement.White);
        expectedMatchElement.add(MatchElement.White);
        this.actualMatchElement = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchElement, equalTo(expectedMatchElement));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Blue);
        humanColors.add(Color.Blue);
        this.expectedMatchElement = new ArrayList<>();
        expectedMatchElement.add(MatchElement.Black);
        expectedMatchElement.add(MatchElement.White);
        this.actualMatchElement = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchElement, equalTo(expectedMatchElement));
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
        this.expectedMatchElement = new ArrayList<>();
        expectedMatchElement.add(MatchElement.Black);
        expectedMatchElement.add(MatchElement.Black);
        expectedMatchElement.add(MatchElement.White);
        expectedMatchElement.add(MatchElement.White);
        this.actualMatchElement = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchElement, equalTo(expectedMatchElement));
    }
}

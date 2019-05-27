package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.MatchingIdentifier;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class ColorMatcherTest {
    private List<Color> masterColors;
    private List<Color> humanColors;
    private List<MatchingIdentifier> actualMatchingIdentifier;
    private List<MatchingIdentifier> expectedMatchingIdentifier;
    private ColorMatcher colorMatcher = new ColorMatcher();

    @Test
    public void givenRedWithRedInputShouldReturnBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        this.expectedMatchingIdentifier = new ArrayList<>();
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        this.actualMatchingIdentifier = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchingIdentifier, equalTo(expectedMatchingIdentifier));
    }

    @Test
    public void givenRedBlueWithRedBlueInputShouldReturnBlackBlack() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Red);
        masterColors.add(Color.Blue);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedMatchingIdentifier = new ArrayList<>();
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        this.actualMatchingIdentifier = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchingIdentifier, equalTo(expectedMatchingIdentifier));
    }

    @Test
    public void givenRedBlueWithBlueRedInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Red);
        humanColors.add(Color.Blue);
        this.expectedMatchingIdentifier = new ArrayList<>();
        expectedMatchingIdentifier.add(MatchingIdentifier.White);
        expectedMatchingIdentifier.add(MatchingIdentifier.White);
        this.actualMatchingIdentifier = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchingIdentifier, equalTo(expectedMatchingIdentifier));
    }

    @Test
    public void givenRedBlueWithBlueBlueInputShouldReturnWhiteWhite() {
        this.masterColors = new ArrayList<>();
        masterColors.add(Color.Blue);
        masterColors.add(Color.Red);
        this.humanColors = new ArrayList<>();
        humanColors.add(Color.Blue);
        humanColors.add(Color.Blue);
        this.expectedMatchingIdentifier = new ArrayList<>();
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        expectedMatchingIdentifier.add(MatchingIdentifier.White);
        this.actualMatchingIdentifier = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchingIdentifier, equalTo(expectedMatchingIdentifier));
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
        this.expectedMatchingIdentifier = new ArrayList<>();
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        expectedMatchingIdentifier.add(MatchingIdentifier.Black);
        expectedMatchingIdentifier.add(MatchingIdentifier.White);
        expectedMatchingIdentifier.add(MatchingIdentifier.White);
        this.actualMatchingIdentifier = colorMatcher.match(humanColors, masterColors);
        assertThat(actualMatchingIdentifier, equalTo(expectedMatchingIdentifier));
    }
}

package com.myob.iris.service;

import com.myob.iris.model.Color;
import com.myob.iris.model.MatchElement;
import com.myob.iris.model.Result;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ValidatorTest {

    @Test
    public void givenListOfColoursWithCorrectLengthShouldReturnTrue() {
        Color[] colors = {Color.Red, Color.Red, Color.Red, Color.Red};
        Result result = Validator.validateLengthOfHumanColorIsFour(Arrays.asList(colors));
        assertTrue(result.isValid());
    }

    @Test
    public void givenListOfColorsWithShorterLengthShouldReturnFalseWithReason() {
        Color[] colors = {Color.Red, Color.Red, Color.Red};
        Result result = Validator.validateLengthOfHumanColorIsFour(Arrays.asList(colors));
        assertFalse(result.isValid());
        assertTrue(result.getReason().isPresent());
    }

    @Test
    public void givenListOfColorsWithLongerLengthShouldReturnFalseWithReason() {
        Color[] colors = {Color.Red, Color.Red, Color.Red, Color.Red, Color.Red};
        Result result = Validator.validateLengthOfHumanColorIsFour(Arrays.asList(colors));
        assertFalse(result.isValid());
        assertTrue(result.getReason().isPresent());
    }

    @Test
    public void givenEmptyMatchingIdentifierShouldReturnFalseWithReason() {
        MatchElement[] matchElement = {};
        Result result = Validator.validateMatchingIdentifierIsNotEmpty(Arrays.asList(matchElement));
        assertFalse(result.isValid());
        assertTrue(result.getReason().isPresent());
    }

    @Test
    public void givenListOfMatchingIdentifierShouldReturnTrue() {
        MatchElement[] matchElement = {MatchElement.White, MatchElement.Black};
        Result result = Validator.validateMatchingIdentifierIsNotEmpty(Arrays.asList(matchElement));
        assertTrue(result.isValid());
    }
}
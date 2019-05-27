package com.myob.iris.service;

import com.myob.iris.model.Color;
import com.myob.iris.model.Constants;
import com.myob.iris.model.MatchingIdentifier;
import com.myob.iris.model.Result;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
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
        MatchingIdentifier[] matchingIdentifier = {};
        Result result = Validator.validateMatchingIdentifierIsNotEmpty(Arrays.asList(matchingIdentifier));
        assertFalse(result.isValid());
        assertTrue(result.getReason().isPresent());
    }

    @Test
    public void givenListOfMatchingIdentifierShouldReturnTrue() {
        MatchingIdentifier[] matchingIdentifier = {MatchingIdentifier.White, MatchingIdentifier.Black};
        Result result = Validator.validateMatchingIdentifierIsNotEmpty(Arrays.asList(matchingIdentifier));
        assertTrue(result.isValid());
    }
}
package com.myob.iris.service;

import com.myob.iris.model.Color;
import com.myob.iris.model.Constants;
import com.myob.iris.model.ValidatorResult;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ColorValidatorTest {

    @Test
    public void validatorShouldReturnTrueGivenListOfColoursWithCorrectLength() {
        Color[] colors = {Color.Red, Color.Red, Color.Red, Color.Red};
        ValidatorResult result = ColorValidator.validateLengthOfListIsFour(Arrays.asList(colors));
        assertTrue(result.isValid());
    }

    @Test
    public void validatorShouldReturnFalseWithReasonGivenListOfColorsWithIncorrectLength() {
        Color[] colors = {Color.Red, Color.Red, Color.Red};
        ValidatorResult result = ColorValidator.validateLengthOfListIsFour(Arrays.asList(colors));
        assertFalse(result.isValid());
        assertThat(result.getReason(), equalTo(Constants.ERROR_INVALID_COLOR));
    }
}
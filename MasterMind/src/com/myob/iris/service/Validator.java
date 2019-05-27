package com.myob.iris.service;

import com.myob.iris.model.Color;
import com.myob.iris.model.Constants;
import com.myob.iris.model.ValidatorResult;

import java.util.List;

class ColorValidator {
    static ValidatorResult validateLengthOfListIsFour(List<Color> humanColor) {
        if (humanColor.size() < Constants.NUM_OF_COLOR_IN_GAME) {
            return new ValidatorResult(false, Constants.ERROR_INVALID_COLOR);
        } else if (humanColor.size() > Constants.NUM_OF_COLOR_IN_GAME) {
            return new ValidatorResult(false, Constants.ERROR_INVALID_LENGTH);
        } else {
            return new ValidatorResult(true, "");
        }
    }
}

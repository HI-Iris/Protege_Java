package com.myob.iris.helper;

import com.myob.iris.model.Color;
import com.myob.iris.model.Constants;
import com.myob.iris.model.MatchElement;
import com.myob.iris.model.Result;

import java.util.List;

public class Validator {
    public static Result validateLengthOfHumanColorIsFour(List<Color> humanColor) {
        if (humanColor.size() < Constants.NUM_OF_COLOR_IN_GAME) {
            return Result.invalid(Constants.ERROR_INVALID_COLOR);
        } else if (humanColor.size() > Constants.NUM_OF_COLOR_IN_GAME) {
            return Result.invalid(Constants.ERROR_INVALID_LENGTH);
        } else {
            return Result.valid();
        }
    }

    public static Result validateMatchElementIsNotEmpty(List<MatchElement> matchElement) {
        return matchElement.size() == 0 ? Result.invalid(Constants.MSG_COLOR_NO_MATCH) : Result.valid();
    }
}

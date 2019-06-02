package com.myob.iris.controller;

import com.myob.iris.model.Constants;
import com.myob.iris.model.MatchElement;
import com.myob.iris.model.Result;

import java.util.List;

public class Referee {

    public Result arbitrate(List<MatchElement> matchElement, int attempts) {
        if (isAllMatchingIdentifierBlack(matchElement) && attempts <= Constants.MAX_ATTEMPT) {
            return Result.valid();
        } else if (attempts > Constants.MAX_ATTEMPT) {
            return Result.invalid(Constants.ERROR_TRY_OVER_60);
        } else
            return Result.invalid(Constants.MSG_NOT_WIN);
    }

    private static boolean isAllMatchingIdentifierBlack(List<MatchElement> matchElement) {
        return isAllMatchingIdentifierSame(matchElement) && isFirstColorInCorrectPosition(matchElement);
    }

    private static boolean isFirstColorInCorrectPosition(List<MatchElement> matchElement) {
        return matchElement.get(0) == MatchElement.Black;
    }

    private static boolean isAllMatchingIdentifierSame(List<MatchElement> matchElement) {
        return matchElement.size() == Constants.NUM_OF_COLOR_IN_GAME && matchElement.stream().distinct().limit(2).count() <= 1;
    }


}

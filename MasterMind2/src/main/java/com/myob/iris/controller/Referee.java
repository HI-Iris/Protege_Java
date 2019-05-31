package com.myob.iris.controller;

import com.myob.iris.model.Constants;
import com.myob.iris.model.MatchingIdentifier;
import com.myob.iris.model.Result;

import java.util.List;

public class Referee {

    public Result arbitrate(List<MatchingIdentifier> matchingIdentifiers, int attempts) {
        if (isAllMatchingIdentifierBlack(matchingIdentifiers) && attempts <= Constants.MAX_ATTEMPT) {
            return Result.valid();
        } else if (attempts > Constants.MAX_ATTEMPT) {
            return Result.invalid(Constants.ERROR_TRY_OVER_60);
        } else
            return Result.invalid(Constants.MSG_NOT_WIN);
    }

    private static boolean isAllMatchingIdentifierBlack(List<MatchingIdentifier> matchingIdentifier) {
        return isAllMatchingIdentifierSame(matchingIdentifier) && isFirstColorInCorrectPosition(matchingIdentifier);
    }

    private static boolean isFirstColorInCorrectPosition(List<MatchingIdentifier> matchingIdentifier) {
        return matchingIdentifier.get(0) == MatchingIdentifier.Black;
    }

    private static boolean isAllMatchingIdentifierSame(List<MatchingIdentifier> matchingIdentifier) {
        return matchingIdentifier.size() == Constants.NUM_OF_COLOR_IN_GAME && matchingIdentifier.stream().distinct().limit(2).count() <= 1;
    }


}

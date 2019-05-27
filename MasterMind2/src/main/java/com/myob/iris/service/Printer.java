package com.myob.iris.service;

import com.myob.iris.model.Constants;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchingIdentifier;

import java.util.List;

public class Printer {
    public void printMatchingIdentifier(List<MatchingIdentifier> matchingIdentifier) {
        if (matchingIdentifier.size() > 0) {
            System.out.println(Constants.MSG_RESULT_CHECK);
            System.out.println(composeIdentifiers(matchingIdentifier));
        } else {
            System.out.println(Constants.MSG_COLOR_NO_MATCH);
        }
    }

    public void printGameState(GameState state) {
        if (state.isWon()) {
            System.out.println(Constants.MSG_WIN);
        }

        if (!state.isWon() && state.getAttempts() > Constants.MAX_ATTEMPT) {
            System.out.println(Constants.ERROR_TRY_OVER_60);
        }
    }

    private String composeIdentifiers(List<MatchingIdentifier> matchingIdentifier) {
        StringBuilder builder = new StringBuilder();
        for (MatchingIdentifier matchingId : matchingIdentifier) {
            builder.append(matchingId).append(" ");
        }
        return builder.toString();
    }
}

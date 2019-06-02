package com.myob.iris.service;

import com.myob.iris.model.Constants;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchElement;

import java.util.List;

public class Printer {
    public void printMatchingIdentifier(List<MatchElement> matchElement) {
        if (matchElement.size() > 0) {
            System.out.println(Constants.MSG_RESULT_CHECK);
            System.out.println(composeIdentifiers(matchElement));
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

    public void printMessage(String message) {
        System.out.println(message);
    }

    private String composeIdentifiers(List<MatchElement> matchElement) {
        StringBuilder builder = new StringBuilder();
        for (MatchElement matchingId : matchElement) {
            builder.append(matchingId).append(" ");
        }
        return builder.toString();
    }
}

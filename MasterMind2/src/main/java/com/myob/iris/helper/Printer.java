package com.myob.iris.helper;

import com.myob.iris.model.Constants;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchElement;

import java.util.List;

public class Printer {
    public void printMatchElement(List<MatchElement> matchElement) {
        if (matchElement.size() > 0) {
            System.out.println(Constants.MSG_RESULT_CHECK);
            System.out.println(composeMatchElement(matchElement));
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

    private String composeMatchElement(List<MatchElement> matchElement) {
        StringBuilder builder = new StringBuilder();
        for (MatchElement element : matchElement) {
            builder.append(element).append(" ");
        }
        return builder.toString();
    }
}

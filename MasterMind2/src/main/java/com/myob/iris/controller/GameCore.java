package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchElement;
import com.myob.iris.model.Result;

import java.util.List;

class GameCore {
    private final Referee referee;
    private final ColorMatcher matcher;
    private final List<Color> masterColors;

    GameCore(List<Color> masterColors, Referee referee, ColorMatcher matcher) {
        this.matcher = matcher;
        this.referee = referee;
        this.masterColors = masterColors;
    }

    List<MatchElement> play(List<Color> humanColors, GameState gameState) {
        List<MatchElement> matchElement = matcher.match(humanColors, masterColors);
        Result roundResult = referee.arbitrate(matchElement, gameState.getAttempts());
        gameState.setWin(roundResult.isValid());
        gameState.increaseAttempt();
        return matchElement;
    }
}

package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchingIdentifier;
import com.myob.iris.model.Result;

import java.util.List;

public class MasterMindCore {
    private final Referee referee;
    private final ColorMatcher matcher;
    private final List<Color> masterColors;

    public MasterMindCore(List<Color> masterColors, Referee referee, ColorMatcher matcher) {
        this.matcher = matcher;
        this.referee = referee;
        this.masterColors = masterColors;
    }

    public List<MatchingIdentifier> play(List<Color> humanColors, GameState gameState) {
        List<MatchingIdentifier> matchingResult = matcher.match(humanColors, masterColors);
        Result roundStatus = referee.arbitrate(matchingResult, gameState.getAttempts());
        gameState.setWin(roundStatus.isValid());
        gameState.increaseAttempt();
        return matchingResult;
    }
}

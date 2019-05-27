package com.myob.iris.controller;

import com.myob.iris.controller.ColorMatcher;
import com.myob.iris.controller.Referee;
import com.myob.iris.model.Color;
import com.myob.iris.model.GameState;
import com.myob.iris.model.MatchingIdentifier;
import com.myob.iris.model.Result;

import java.util.List;

public class MasterMindCore {
    private GameState state;
    private final Referee referee;
    private final ColorMatcher matcher;
    private final List<Color> masterColors;

    public MasterMindCore(List<Color> masterColors, Referee referee, ColorMatcher matcher) {
        this.matcher = matcher;
        this.state = new GameState(false, 0);
        this.referee = referee;
        this.masterColors = masterColors;
    }

    public List<MatchingIdentifier> play(List<Color> humanColors) {
        List<MatchingIdentifier> identifiers = this.matcher.match(humanColors, this.masterColors);
        Result roundStatus = this.referee.isWon(identifiers, this.state.getAttempts());
        this.state.setWin(roundStatus.isValid());
        this.state.increaseAttempt();
        return identifiers;
    }

    public GameState getState() {
        return state;
    }
}

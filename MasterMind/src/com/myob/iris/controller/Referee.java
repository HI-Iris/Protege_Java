package com.myob.iris.controller;

import com.myob.iris.Exceptions.GameMaxAttemptException;
import com.myob.iris.model.Color;
import com.myob.iris.model.Result;
import com.myob.iris.model.Constants;
import com.myob.iris.service.Validation;

import java.util.List;

public class MasterMindStarter {
    private Referee referee;
    private List<Color> masterColors;
    private int attempts;
    private boolean areAllMatch;

    public MasterMindStarter(List<Color> masterColors, Referee referee) {
        this.referee = referee;
        this.masterColors = masterColors;
        this.attempts = 0;
        this.areAllMatch = false;
    }

    public List<Result> play(List<Color> humanColors) throws GameMaxAttemptException {
        if (this.attempts == Constants.MAX_ATTEMPT) {
            throw new GameMaxAttemptException(Constants.ERROR_TRY_OVER_60);
        }
        List<Result> resultBlocks = referee.matchHumanColorWithMasterColor(humanColors, this.masterColors);
        this.areAllMatch = Validation.areAllResultBlocksBlack(resultBlocks);
        this.attempts += 1;
        return resultBlocks;
    }

    public boolean winCheck() {
        return this.attempts <= Constants.MAX_ATTEMPT && this.areAllMatch;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setAreAllMatch(boolean areAllMatch) {
        this.areAllMatch = areAllMatch;
    }

}

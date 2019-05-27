package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.Result;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    public List<Result> matchHumanColorWithMasterColor(List<Color> humanColors, List<Color> masterColors) {
        List<Result> resultBlocks = new ArrayList<>();
        for (int i = 0; i < humanColors.size(); i++) {
            if (isBothColorAndPositionCorrect(humanColors, masterColors, i)) {
                resultBlocks.add(Result.Black);
            }
            if (isColorCorrectButPositionWrong(humanColors, masterColors, i)) {
                resultBlocks.add(Result.White);
            }
        }
        return resultBlocks;
    }

    private boolean isColorCorrectButPositionWrong(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return (masterColors.contains(humanColors.get(indexOfList))) && (humanColors.get(indexOfList) != masterColors.get(indexOfList));
    }

    private boolean isBothColorAndPositionCorrect(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return humanColors.get(indexOfList) == masterColors.get(indexOfList);
    }



}


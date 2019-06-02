package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.MatchElement;

import java.util.ArrayList;
import java.util.List;

public class ColorMatcher {
    public List<MatchElement> match(List<Color> humanColors, List<Color> masterColors) {
        List<MatchElement> matchElement = new ArrayList<>();
        for (int i = 0; i < humanColors.size(); i++) {
            if (isBothColorAndPositionCorrect(humanColors, masterColors, i)) {
                matchElement.add(MatchElement.Black);
            }
            if (isColorCorrectButPositionWrong(humanColors, masterColors, i)) {
                matchElement.add(MatchElement.White);
            }
        }
        return matchElement;
    }

    private boolean isColorCorrectButPositionWrong(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return (masterColors.contains(humanColors.get(indexOfList))) && (humanColors.get(indexOfList) != masterColors.get(indexOfList));
    }

    private boolean isBothColorAndPositionCorrect(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return humanColors.get(indexOfList) == masterColors.get(indexOfList);
    }
}


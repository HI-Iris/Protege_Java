package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.MatchingIdentifier;

import java.util.ArrayList;
import java.util.List;

public class ColorMatcher {
    public List<MatchingIdentifier> match(List<Color> humanColors, List<Color> masterColors) {
        List<MatchingIdentifier> matchingIdentifier = new ArrayList<>();
        for (int i = 0; i < humanColors.size(); i++) {
            if (isBothColorAndPositionCorrect(humanColors, masterColors, i)) {
                matchingIdentifier.add(MatchingIdentifier.Black);
            }
            if (isColorCorrectButPositionWrong(humanColors, masterColors, i)) {
                matchingIdentifier.add(MatchingIdentifier.White);
            }
        }
        return matchingIdentifier;
    }

    private boolean isColorCorrectButPositionWrong(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return (masterColors.contains(humanColors.get(indexOfList))) && (humanColors.get(indexOfList) != masterColors.get(indexOfList));
    }

    private boolean isBothColorAndPositionCorrect(List<Color> humanColors, List<Color> masterColors, int indexOfList) {
        return humanColors.get(indexOfList) == masterColors.get(indexOfList);
    }
}


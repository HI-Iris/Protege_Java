package com.myob.iris.controller;

import com.myob.iris.model.*;
import com.myob.iris.service.InputSplitter;
import com.myob.iris.service.Validator;

import java.util.List;
import java.util.Scanner;

class HumanColorParser {
    private ColorBuilder humanColorBuilder;
    private InputSplitter inputSplitter;

    HumanColorParser(ColorBuilder humanColorBuilder, InputSplitter inputSplitter) {
        this.humanColorBuilder = humanColorBuilder;
        this.inputSplitter = inputSplitter;
    }

    List<Color> getHumanColors() {
        List<Color> humanColors;
        Result humanColorBuildResult;
        do {
            System.out.println(Constants.MSG_ENTER_COLOR);
            String[] userInput = inputSplitter.splitRawInputToArray(new Scanner(System.in));
            humanColors = humanColorBuilder.buildColor(userInput);
            humanColorBuildResult = Validator.validateLengthOfHumanColorIsFour(humanColors);
            humanColorBuildResult.getReason().ifPresent(System.out::println);
        } while (!humanColorBuildResult.isValid());
        return humanColors;
    }
}

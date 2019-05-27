package com.myob.iris.controller;

import com.myob.iris.model.*;
import com.myob.iris.service.Parser;
import com.myob.iris.service.Validator;

import java.util.List;
import java.util.Scanner;

public class HumanCore {
    private ColorBuilder humanColorBuilder;
    private Parser parser;

    public HumanCore(ColorBuilder humanColorBuilder, Parser parser) {
        this.humanColorBuilder = humanColorBuilder;
        this.parser = parser;
    }

    public List<Color> getHumanColors() {
        List<Color> humanColors;
        Result humanColorBuildResult;
        do {
            System.out.println(Constants.MSG_ENTER_COLOR);
            String[] userInput = parser.parseRawInputToList(new Scanner(System.in));
            humanColors = humanColorBuilder.buildColor(userInput);
            humanColorBuildResult = Validator.validateLengthOfHumanColorIsFour(humanColors);
            humanColorBuildResult.getReason().ifPresent(System.out::println);
        } while (!humanColorBuildResult.isValid());
        return humanColors;
    }
}

package com.myob.iris.service;

import com.myob.iris.model.*;

import java.util.List;
import java.util.Scanner;

public class ConsoleParser {
    private ColorBuilder humanColorBuilder = new HumanColorBuilder();

    public List<Color> getHumanColorFromInput() {
        String userInput;
        List<Color> humanColor;
        do {
            System.out.println(Constants.MSG_ENTER_COLOR);
            userInput = new Scanner(System.in).nextLine();
            humanColor = humanColorBuilder.buildColor(userInput.split(" "));
        } while (!ColorValidator.validateLenghtOfListIsFour(humanColor).isValid());
        return humanColor;
    }


}

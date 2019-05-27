package com.myob.iris.model;

import java.util.ArrayList;
import java.util.List;

public class HumanColorBuilder implements ColorBuilder {
    @Override
    public List<Color> buildColor(String[]... userInput) {
        int num = userInput[0].length;
        List<Color> humanColor= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            switch (userInput[0][i].toUpperCase()) {
                case "RED":
                    humanColor.add(Color.Red);
                    break;
                case "BLUE":
                    humanColor.add(Color.Blue);
                    break;
                case "YELLOW":
                    humanColor.add(Color.Yellow);
                    break;
                case "GREEN":
                    humanColor.add(Color.Green);
                    break;
                case "PURPLE":
                    humanColor.add(Color.Purple);
                    break;
                case "ORANGE":
                    humanColor.add(Color.Orange);
                    break;
                default:
                    break;
            }
        }
        return humanColor;
    }
}

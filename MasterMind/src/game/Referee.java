package game;

import color.Color;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    public List<Result> matchHumanColorWithMasterMind(List<Color> humanColors, List<Color> masterColors) {
        List<Result> result = new ArrayList<>();
        for (int i = 0; i < humanColors.size(); i++) {
            if (humanColors.get(i) == masterColors.get(i)) {
                result.add(Result.Black);
            }
            if ((masterColors.contains(humanColors.get(i))) && (humanColors.get(i) != masterColors.get(i))) {
                result.add(Result.White);
            }
        }
        return result;
    }
}


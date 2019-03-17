import java.util.ArrayList;
import java.util.List;

class GameRules {
    static List<Result> match(List<Color> humanColor, MasterMind masterMind) {
        List<Color> masterColors = masterMind.getMasterColors();
        List<Result> result = new ArrayList<>();
        for (int i = 0; i < humanColor.size(); i++) {
            if (humanColor.get(i) == masterColors.get(i)) {
                result.add(Result.Black);
            }
            if ((masterColors.contains(humanColor.get(i))) && (humanColor.get(i) != masterColors.get(i))) {
                result.add(Result.White);
            }
        }
        return result;
    }
}


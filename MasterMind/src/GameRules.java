import java.util.ArrayList;
import java.util.Arrays;

class GameRules {
    static Result[] match(Color[] humanColor, MasterMind masterMind) {
        ArrayList<Result> result = new ArrayList<>();
        for (int i = 0; i < humanColor.length; i++) {
            if (humanColor[i] == masterMind.getMasterColors()[i]) {
                result.add(Result.Black);
            }
            if ((Arrays.asList(masterMind.getMasterColors()).contains(humanColor[i])) && (humanColor[i] != masterMind.getMasterColors()[i])){
                result.add(Result.White);
            }
        }
        return result.toArray(Result[]::new);
    }
}


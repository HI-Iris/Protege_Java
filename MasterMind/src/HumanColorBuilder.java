import java.util.ArrayList;
import java.util.List;

class HumanColorBuilder implements ColorBuilder {
    @Override
    public List<Color> buildColor(String[]... userInput) {
        int num = userInput[0].length;
        List<Color> result= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            switch (userInput[0][i]) {
                case "Red":
                    result.add(Color.Red);
                    break;
                case "Blue":
                    result.add(Color.Blue);
                    break;
                case "Yellow":
                    result.add(Color.Yellow);
                    break;
                case "Green":
                    result.add(Color.Green);
                    break;
                case "Purple":
                    result.add(Color.Purple);
                    break;
                case "Orange":
                    result.add(Color.Orange);
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}

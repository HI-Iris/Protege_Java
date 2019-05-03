package color;

import java.util.ArrayList;
import java.util.List;

public class HumanColorBuilder implements ColorBuilder {
    @Override
    public List<Color> buildColor(String[]... userInput) {
        int num = userInput[0].length;
        List<Color> colorList= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            switch (userInput[0][i].toUpperCase()) {
                case "RED":
                    colorList.add(Color.Red);
                    break;
                case "BLUE":
                    colorList.add(Color.Blue);
                    break;
                case "YELLOW":
                    colorList.add(Color.Yellow);
                    break;
                case "GREEN":
                    colorList.add(Color.Green);
                    break;
                case "PURPLE":
                    colorList.add(Color.Purple);
                    break;
                case "ORANGE":
                    colorList.add(Color.Orange);
                    break;
                default:
                    break;
            }
        }
        return colorList;
    }
}

package color;

import model.Color;
import model.Constants;

import java.util.ArrayList;
import java.util.List;

public class MasterColorBuilder implements ColorBuilder {
    private static int getRandomColorIndex() {
        return (int) (Math.random() * Constants.NUM_OF_COLOR_IN_TOTAL);
    }

    @Override
    public List<Color> buildColor(String[]... userInput) {
        List<Color> masterColor = new ArrayList<>();
        for (int i = 0; i < Constants.NUM_OF_COLOR_IN_GAME; i++) {
            masterColor.add(Color.values()[getRandomColorIndex()]);
        }
        return masterColor;
    }
}

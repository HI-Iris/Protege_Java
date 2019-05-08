package color;

import model.Color;

import java.util.List;

public interface ColorBuilder {
    List<Color> buildColor(String[]... userInput);
}

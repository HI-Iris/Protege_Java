package com.myob.iris.model;

import java.util.List;

public interface ColorBuilder {
    List<Color> buildColor(String[]... userInput);
}

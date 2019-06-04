package com.myob.iris.helper;

import com.myob.iris.model.Color;

import java.util.List;

public interface ColorBuilder {
    List<Color> buildColor(String[]... userInput);
}

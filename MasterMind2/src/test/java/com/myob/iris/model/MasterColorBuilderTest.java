package com.myob.iris.model;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MasterColorBuilderTest {
    private ColorBuilder masterColorBuilder = new MasterColorBuilder();

    @Test
    public void masterColorBuilderShouldReturn4Colors() {
        List<Color> masterColor = this.masterColorBuilder.buildColor();
        assertThat(masterColor.size(), equalTo(Constants.NUM_OF_COLOR_IN_GAME));
    }
}
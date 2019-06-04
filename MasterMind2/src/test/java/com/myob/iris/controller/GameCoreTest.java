package com.myob.iris.controller;

import com.myob.iris.model.Color;
import com.myob.iris.model.GameState;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GameCoreTest {
    private Referee referee = new Referee();
    private ColorMatcher colorMatcher = new ColorMatcher();
    private GameState gameState = new GameState(false, 59);
    private List<Color> masterColor = new ArrayList<>() {{
        add(Color.Orange);
        add(Color.Blue);
        add(Color.Red);
        add(Color.Yellow);
    }};
    private List<Color> humanColorDoNotMatch = new ArrayList<>() {{
        add(Color.Green);
        add(Color.Green);
        add(Color.Purple);
        add(Color.Purple);
    }};
    private List<Color> humanColorMatch = new ArrayList<>() {{
        add(Color.Orange);
        add(Color.Blue);
        add(Color.Red);
        add(Color.Yellow);
    }};
    GameCore core = new GameCore(masterColor, referee, colorMatcher);

    @Test
    public void givenNoMatchHumanColorSetGameStateFalseIncreaseAttemptsBy1() {
        core.play(humanColorDoNotMatch, gameState);
        assertThat(gameState.isWon(), equalTo(false));
        assertThat(gameState.getAttempts(), equalTo(60));
    }

    @Test
    public void givenMatchHumanColorSetGameStateTrueIncreaseAttemptsBy1() {
        core.play(humanColorMatch, gameState);
        assertThat(gameState.isWon(), equalTo(true));
        assertThat(gameState.getAttempts(), equalTo(60));
    }
}
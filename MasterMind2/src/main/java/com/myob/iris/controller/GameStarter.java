package com.myob.iris.controller;

import com.myob.iris.helper.HumanColorParser;
import com.myob.iris.model.*;
import com.myob.iris.helper.InputSplitter;
import com.myob.iris.helper.Printer;

import java.util.List;

public class GameStarter {
    private GameCore game;
    private HumanColorParser humanColorParser;
    private Printer printer;
    private GameState gameState;

    public GameStarter() {
        MasterColorBuilder masterColorBuilder = new MasterColorBuilder();
        HumanColorBuilder humanColorBuilder = new HumanColorBuilder();
        InputSplitter inputSplitter = new InputSplitter();
        ColorMatcher colorMatcher = new ColorMatcher();
        Referee referee = new Referee();

        this.game = new GameCore(masterColorBuilder.buildColor(), referee, colorMatcher);
        this.humanColorParser = new HumanColorParser(humanColorBuilder, inputSplitter);
        this.printer = new Printer();
        this.gameState = new GameState(false, 0);
    }

    public void start() {
        printer.printMessage(Constants.MSG_WELCOME);
        do {
            List<Color> humanColors = humanColorParser.getHumanColors();
            List<MatchElement> matchElement = game.play(humanColors, gameState);
            printer.printMatchElement(matchElement);
            printer.printGameState(gameState);
        } while (!gameState.isWon());
    }
}

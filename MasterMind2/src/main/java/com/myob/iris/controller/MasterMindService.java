package com.myob.iris.controller;

import com.myob.iris.model.*;
import com.myob.iris.service.InputSplitter;
import com.myob.iris.service.Printer;

import java.util.List;

public class MasterMindService {
    private MasterMindCore game;
    private HumanColorParser human;
    private Printer printer;
    private GameState gameState;

    public MasterMindService() {
        MasterColorBuilder masterColorBuilder = new MasterColorBuilder();
        HumanColorBuilder humanColorBuilder = new HumanColorBuilder();
        InputSplitter inputSplitter = new InputSplitter();
        ColorMatcher colorMatcher = new ColorMatcher();
        Referee referee = new Referee();

        this.game = new MasterMindCore(masterColorBuilder.buildColor(), referee, colorMatcher);
        this.human = new HumanColorParser(humanColorBuilder, inputSplitter);
        this.printer = new Printer();
        this.gameState = new GameState(false, 0);
    }

    public void start() {
        printer.printMessage(Constants.MSG_WELCOME);
        do {
            List<Color> humanColors = human.getHumanColors();
            List<MatchingIdentifier> roundResult = game.play(humanColors, gameState);
            printer.printMatchingIdentifier(roundResult);
            printer.printGameState(gameState);
        } while (!gameState.isWon());
    }
}

package com.myob.iris.controller;

import com.myob.iris.model.*;
import com.myob.iris.service.InputSplitter;
import com.myob.iris.service.Printer;

import java.util.List;

public class MasterMindService {
    private MasterMindCore game;
    private HumanColorService humanColorService;
    private Printer printer;
    private GameState gameState;

    public MasterMindService() {
        MasterColorBuilder masterColorBuilder = new MasterColorBuilder();
        HumanColorBuilder humanColorBuilder = new HumanColorBuilder();
        InputSplitter inputSplitter = new InputSplitter();
        ColorMatcher colorMatcher = new ColorMatcher();
        Referee referee = new Referee();

        this.game = new MasterMindCore(masterColorBuilder.buildColor(), referee, colorMatcher);
        this.humanColorService = new HumanColorService(humanColorBuilder, inputSplitter);
        this.printer = new Printer();
        this.gameState = new GameState(false, 0);
    }

    public void start() {
        printer.printMessage(Constants.MSG_WELCOME);
        do {
            List<Color> humanColors = humanColorService.getHumanColors();
            List<MatchElement> matchElement = game.play(humanColors, gameState);
            printer.printMatchingIdentifier(matchElement);
            printer.printGameState(gameState);
        } while (!gameState.isWon());
    }
}

package com.myob.iris;

import com.myob.iris.controller.ColorMatcher;
import com.myob.iris.controller.HumanCore;
import com.myob.iris.controller.Referee;
import com.myob.iris.model.*;
import com.myob.iris.controller.MasterMindCore;
import com.myob.iris.service.Parser;
import com.myob.iris.service.Printer;

import java.util.List;

public class MasterMindApplication {
    private ColorBuilder masterColorBuilder;
    private ColorBuilder humanColorBuilder;
    private Parser parser;
    private ColorMatcher colorMatcher;
    private Printer printer;
    private Referee referee;

    public static void main(String[] args) {
        MasterMindApplication application = new MasterMindApplication();
        application.start();
    }

    private MasterMindApplication() {
        this.masterColorBuilder = new MasterColorBuilder();
        this.humanColorBuilder = new HumanColorBuilder();
        this.parser = new Parser();
        this.colorMatcher = new ColorMatcher();
        this.printer = new Printer();
        this.referee = new Referee();
    }

    private void start() {
        List<Color> masterColors = masterColorBuilder.buildColor();
        MasterMindCore game = new MasterMindCore(masterColors, referee, colorMatcher);
        HumanCore human = new HumanCore(humanColorBuilder,parser);
        GameState state;
        System.out.println(Constants.MSG_WELCOME);
        do {
            List<Color> humanColors = human.getHumanColors();
            List<MatchingIdentifier> matchingIdentifier = game.play(humanColors);
            state = game.getState();
            printer.printMatchingIdentifier(matchingIdentifier);
            printer.printGameState(state);
        } while (!state.isWon());
    }


}

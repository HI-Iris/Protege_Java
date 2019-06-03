package com.myob.iris;

import com.myob.iris.controller.*;

public class MasterMindApplication {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.start();
}
}

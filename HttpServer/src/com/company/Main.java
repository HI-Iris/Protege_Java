package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GreetServer firstServer = new GreetServer();
        firstServer.start(6666);
    }
}

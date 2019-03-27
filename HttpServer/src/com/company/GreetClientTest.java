package com.company;


import java.io.IOException;

import static org.junit.Assert.*;

public class GreetClientTest {
    @org.junit.Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }

}

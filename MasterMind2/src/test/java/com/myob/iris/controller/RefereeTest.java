package com.myob.iris.controller;

import com.myob.iris.model.MatchElement;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RefereeTest {
    private Referee referee = new Referee();
    private List<MatchElement> allBlack = Arrays.asList(MatchElement.Black, MatchElement.Black, MatchElement.Black, MatchElement.Black);
    private List<MatchElement> notAllBlack = Arrays.asList(MatchElement.Black, MatchElement.White, MatchElement.White, MatchElement.Black);

    @Test
    public void givenAttempts59AndAllBlackReturnTrue() {
        assertTrue(this.referee.arbitrate(allBlack ,59).isValid());
    }

    @Test
    public void givenAttempts60AndAllBlackReturnTrue() {
        assertTrue(this.referee.arbitrate(allBlack ,60).isValid());
    }

    @Test
    public void givenAttempts59AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.arbitrate(notAllBlack ,59).isValid());

    }

    @Test
    public void givenAttempts60AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.arbitrate(notAllBlack ,60).isValid());
    }

    @Test
    public void givenAttempts61AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.arbitrate(notAllBlack ,61).isValid());
    }

    @Test
    public void givenAttempts61AndAllBlackReturnFalse() {
        assertFalse(this.referee.arbitrate(allBlack ,61).isValid());
    }

}
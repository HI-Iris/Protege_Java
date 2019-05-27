package com.myob.iris.controller;

import com.myob.iris.model.MatchingIdentifier;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RefereeTest {
    private Referee referee = new Referee();
    private List<MatchingIdentifier> allBlack = Arrays.asList(MatchingIdentifier.Black, MatchingIdentifier.Black, MatchingIdentifier.Black, MatchingIdentifier.Black);
    private List<MatchingIdentifier> notAllBlack = Arrays.asList(MatchingIdentifier.Black, MatchingIdentifier.White, MatchingIdentifier.White, MatchingIdentifier.Black);

    @Test
    public void givenAttempts59AndAllBlackReturnTrue() {
        assertTrue(this.referee.isWon(allBlack ,59).isValid());
    }

    @Test
    public void givenAttempts60AndAllBlackReturnTrue() {
        assertTrue(this.referee.isWon(allBlack ,60).isValid());
    }

    @Test
    public void givenAttempts59AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.isWon(notAllBlack ,59).isValid());

    }

    @Test
    public void givenAttempts60AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.isWon(notAllBlack ,60).isValid());
    }

    @Test
    public void givenAttempts61AndNotAllBlackReturnFalse() {
        assertFalse(this.referee.isWon(notAllBlack ,61).isValid());
    }

    @Test
    public void givenAttempts61AndAllBlackReturnFalse() {
        assertFalse(this.referee.isWon(allBlack ,61).isValid());
    }

}
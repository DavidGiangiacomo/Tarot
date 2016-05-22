package com.giangiacomod.tarot.model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CardTest {

    @Test
    public void should_have_four_suits_trumps_and_fool() {
        assertEquals(4, OrdinaryCard.Suit.values().length);
    }

}

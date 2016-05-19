package com.giangiacomod.tarot.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    @Test
    public void should_have_78_card() {
        Deck deck = new Deck();

        assertEquals(78, deck.size());
    }

    @Test
    public void should_have_4_suits() {
        Deck deck = new Deck();
    }

    @Test
    public void should_have_one_fool() {

    }

    @Test
    public void should_have_21_trumps() {

    }
}

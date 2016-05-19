package com.giangiacomod.tarot.model;

public class Deck {

    private static final int DECK_SIZE = 78;
    public Card[] cards;

    public Deck() {
        cards = new Card[DECK_SIZE];
    }

    public int size() {
        return DECK_SIZE;
    }
}

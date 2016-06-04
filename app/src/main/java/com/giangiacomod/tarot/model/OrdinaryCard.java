package com.giangiacomod.tarot.model;

public class OrdinaryCard extends Card {

    public OrdinaryCard(CardSuit suit, CardValue value) {
        super(suit, value);
    }

    public enum Suit {
        HEART, DIAMOND, SPADE, CLUB
    }


    private Suit suit;


}

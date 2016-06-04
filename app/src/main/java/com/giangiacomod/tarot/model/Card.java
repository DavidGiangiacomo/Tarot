package com.giangiacomod.tarot.model;

public class Card {

    public CardValue value;
    private CardSuit suit;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }
}

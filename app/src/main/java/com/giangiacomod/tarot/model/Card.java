package com.giangiacomod.tarot.model;

public class Card {

    private CardValue value;
    private CardSuit suit;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean winsOver(Card card) {
        if (suit.equals(card.suit)) {
            return value.isGreater(card.value);
        }
        if (CardSuit.TRUMP.equals(suit)) {
            return true;
        }
        if (CardSuit.TRUMP.equals(card.suit)) {
            return false;
        }
        return true;
    }
}

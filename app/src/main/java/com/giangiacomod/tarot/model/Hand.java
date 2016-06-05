package com.giangiacomod.tarot.model;

import com.giangiacomod.tarot.model.card.Card;

public class Hand {

    public int nbRemainingCards() {
        return 18;
    }

    public Card[] cards() {
        return new Card[18];
    }
}

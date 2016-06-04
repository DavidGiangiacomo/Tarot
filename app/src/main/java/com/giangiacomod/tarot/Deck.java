package com.giangiacomod.tarot;

import com.giangiacomod.tarot.model.Card;
import com.giangiacomod.tarot.model.CardSuit;
import com.giangiacomod.tarot.model.CardValue;

import java.util.ArrayList;
import java.util.List;

public abstract class Deck {

    public List<Card> getCards() {
        ArrayList<Card> cards = new ArrayList<>(0);
        for (int i = 0; i < getNbCards(); i++) {
            cards.add(new Card(CardSuit.HEART, CardValue.ONE));
        }
        return cards;
    }

    protected abstract int getNbCards();
}

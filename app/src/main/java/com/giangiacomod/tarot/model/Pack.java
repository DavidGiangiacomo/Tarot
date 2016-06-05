package com.giangiacomod.tarot.model;

import com.giangiacomod.tarot.model.card.Card;
import com.giangiacomod.tarot.model.card.CardFactory;
import com.giangiacomod.tarot.model.card.CardSuit;
import com.giangiacomod.tarot.model.card.CardValue;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    public List<Card> cards;

    public Pack() {
        cards = new ArrayList<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : suit.cardValues()) {
                cards.add(CardFactory.get(suit, value));
            }
        }
    }
}

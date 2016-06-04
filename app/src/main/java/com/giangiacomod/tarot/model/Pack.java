package com.giangiacomod.tarot.model;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    public List<Card> cards;

    public Pack() {
        cards = new ArrayList<>();
        for (int i = 0; i < 78; i++) {
            cards.add(new Card(CardSuit.HEART,CardValue.ONE));
        }
    }
}

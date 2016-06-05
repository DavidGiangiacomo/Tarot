package com.giangiacomod.tarot.model.card;

import com.giangiacomod.tarot.model.card.Card;
import com.giangiacomod.tarot.model.card.CardSuit;
import com.giangiacomod.tarot.model.card.CardValue;

public class CardFactory {

    public static Card get(CardSuit suit, CardValue value) {
        switch (suit) {
            case CLUB:
                return new ClubCard(value);
            case DIAMOND:
                return new DiamondCard(value);
            case HEART:
                return new HeartCard(value);
            case SPADE:
                return new SpadeCard(value);
            case TRUMP:
                return new TrumpCard(value);
            case FOOL:
                return new FoolCard();
        }
        throw new IllegalArgumentException("Unknown Suit");
    }
}

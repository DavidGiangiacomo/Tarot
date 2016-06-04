package com.giangiacomod.tarot;

import com.giangiacomod.tarot.model.Card;
import com.giangiacomod.tarot.model.CardSuit;
import com.giangiacomod.tarot.model.CardValue;

public class CardFactory {
    public static Card getCard() {
        //TODO creer test : verifier que la carte n'a pas déjà été dealée ? qu'elle existe (pas de roi d'atout, pas de 15 de coeurs)
        return new Card(CardSuit.DIAMOND, CardValue.ONE);
    }
}

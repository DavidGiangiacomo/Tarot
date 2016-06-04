package com.giangiacomod.tarot.model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class CardTest {

    //TODO créer un comparateur et une factory de carte
    @Test
    public void eight_of_hearts_is_greater_than_three_of_heart() {
        Card card8 = new Card(CardSuit.HEART, CardValue.EIGHT);
        Card card3 = new Card(CardSuit.HEART, CardValue.THREE);
        assertTrue(card8.value.value > card3.value.value);
    }

    @Test
    public void king_of_diamond_is_greater_than_five() {
        Card cardKing = new Card(CardSuit.DIAMOND, CardValue.KING);
        Card card5 = new Card(CardSuit.DIAMOND, CardValue.FIVE);
        assertTrue(cardKing.value.value > card5.value.value);
    }
}

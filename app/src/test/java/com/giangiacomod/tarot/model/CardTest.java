package com.giangiacomod.tarot.model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CardTest {

    //TODO créer un comparateur et une factory de carte
    @Test
    public void eight_of_hearts_wins_over_the_three_of_heart() {
        Card cardH8 = new Card(CardSuit.HEART, CardValue.EIGHT);
        Card cardH3 = new Card(CardSuit.HEART, CardValue.THREE);
        assertTrue(cardH8.winsOver(cardH3));
    }

    @Test
    public void king_of_diamond_wins_over_the_five() {
        Card cardKingDiamond = new Card(CardSuit.DIAMOND, CardValue.KING);
        Card card5Diamond = new Card(CardSuit.DIAMOND, CardValue.FIVE);
        assertTrue(cardKingDiamond.winsOver(card5Diamond));
    }
    
    @Test
    public void two_of_club_wins_over_the_seven_of_spade() {
        Card card2Club = new Card(CardSuit.CLUB, CardValue.TWO);
        Card card8Spade = new Card(CardSuit.SPADE, CardValue.SEVEN);
        assertTrue(card2Club.winsOver(card8Spade));
    }

    @Test
    public void fifteen_trump_wins_over_two_trump() {
        Card cardFifteenTrump = new Card(CardSuit.TRUMP, CardValue.FIFTEEN);
        Card cardTwoTrump = new Card(CardSuit.TRUMP, CardValue.TWO);
        assertTrue(cardFifteenTrump.winsOver(cardTwoTrump));
    }

    @Test
    public void three_of_club_loses_two_of_trump() {
        Card cardThreeClub = new Card(CardSuit.CLUB, CardValue.THREE);
        Card cardTwoTrump = new Card(CardSuit.TRUMP, CardValue.TWO);
        assertFalse(cardThreeClub.winsOver(cardTwoTrump));
        assertTrue(cardTwoTrump.winsOver(cardThreeClub));
    }
}

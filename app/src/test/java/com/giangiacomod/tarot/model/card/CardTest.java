package com.giangiacomod.tarot.model.card;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CardTest {

    //TODO créer un comparateur et une factory de carte
    @Test
    public void eight_of_heart_wins_over_the_three_of_heart() {
        Card cardH8 = CardFactory.get(CardSuit.HEART, CardValue.EIGHT);
        Card cardH3 = CardFactory.get(CardSuit.HEART, CardValue.THREE);
        assertTrue(cardH8.winsOver(cardH3));
    }
    @Test
    public void three_of_heart_loses_over_the_eight_of_heart() {
        Card cardH8 = CardFactory.get(CardSuit.HEART, CardValue.EIGHT);
        Card cardH3 = CardFactory.get(CardSuit.HEART, CardValue.THREE);
        assertFalse(cardH3.winsOver(cardH8));
    }

    @Test
    public void king_of_diamond_wins_over_the_five() {
        Card cardKingDiamond = CardFactory.get(CardSuit.DIAMOND, CardValue.KING);
        Card card5Diamond = CardFactory.get(CardSuit.DIAMOND, CardValue.FIVE);
        assertTrue(cardKingDiamond.winsOver(card5Diamond));
    }
    
    @Test
    public void two_of_club_wins_over_the_seven_of_spade() {
        Card card2Club = CardFactory.get(CardSuit.CLUB, CardValue.TWO);
        Card card8Spade = CardFactory.get(CardSuit.SPADE, CardValue.SEVEN);
        assertTrue(card2Club.winsOver(card8Spade));
    }

    @Test
    public void fifteen_trump_wins_over_two_trump() {
        Card cardFifteenTrump = CardFactory.get(CardSuit.TRUMP, CardValue.FIFTEEN);
        Card cardTwoTrump = CardFactory.get(CardSuit.TRUMP, CardValue.TWO);
        assertTrue(cardFifteenTrump.winsOver(cardTwoTrump));
    }

    @Test
    public void three_of_club_loses_two_of_trump() {
        Card threeClubCard = CardFactory.get(CardSuit.CLUB, CardValue.THREE);
        Card twoTrumpCard = CardFactory.get(CardSuit.TRUMP, CardValue.TWO);
        assertFalse(threeClubCard.winsOver(twoTrumpCard));
        assertTrue(twoTrumpCard.winsOver(threeClubCard));
    }

    @Test
    public void fool_does_not_win_over_eleven_trump() {
        Card foolCard = CardFactory.get(CardSuit.FOOL, CardValue.FOOL);
        Card elevenTrumpCard = CardFactory.get(CardSuit.TRUMP, CardValue.ELEVEN);
        assertFalse(foolCard.winsOver(elevenTrumpCard));
        assertFalse(elevenTrumpCard.winsOver(foolCard));
    }
}

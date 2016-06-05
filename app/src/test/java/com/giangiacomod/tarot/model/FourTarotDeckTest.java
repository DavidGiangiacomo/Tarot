package com.giangiacomod.tarot.model;

import com.giangiacomod.tarot.model.card.Card;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class FourTarotDeckTest {

    private FourTarotDeck deck;

    @Before
    public void initialize() {
        deck = new FourTarotDeck();
    }

    @Test
    public void should_have_4_players() {
        assertEquals(4, deck.getNbPlayer());
    }

    @Test
    public void should_have_four_hands_of_18_cards() {
        Hand[] hands = deck.deal();
        assertEquals(4, hands.length);
        for (Hand hand : hands) {
            assertEquals(18, hand.nbRemainingCards());
        }
    }

    @Test
    public void should_have_18_different_cards_in_each_hand() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Hand hand : deck.deal()) {
            for (Card card : hand.cards()) {
                assertFalse(cards.contains(card));
                cards.add(card);
            }
        }
    }
}

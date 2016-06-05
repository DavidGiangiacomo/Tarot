package com.giangiacomod.tarot.model.card;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardFactoryTest {

    @Test
    public void should_get_ace_of_spade() throws Exception {
        Card card = CardFactory.get(CardSuit.SPADE, CardValue.ONE);
        assertTrue(card instanceof SpadeCard);
        assertEquals(CardValue.ONE, card.getValue());
    }
}
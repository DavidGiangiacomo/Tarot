package com.giangiacomod.tarot.model;

import com.giangiacomod.tarot.model.card.Card;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PackTest {

    private Pack pack;

    @Before
    public void initialize() {
        pack = new Pack();
    }

    @Test
    public void pack_exists() {
        assertNotNull(pack);
    }

    @Test
    public void pack_has_78_cards() {
        assertEquals(78, pack.cards.size());
    }

    @Test
    public void pack_has_78_different_cards() {
        Set<Card> existingCards = new HashSet<>();
        for (Card card : pack.cards) {
            existingCards.add(card);
        }
        assertEquals(78, existingCards.size());
    }
}
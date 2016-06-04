package com.giangiacomod.tarot.model;

import org.junit.Before;
import org.junit.Test;

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
}
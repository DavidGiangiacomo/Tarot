package com.giangiacomod.tarot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void initialize() {
        game = new Game();
    }

    @Test
    public void should_have_a_dog() {
        assertNotNull(game.dog());
    }

    @Test
    public void should_have_four_decks() {
        for (int i = 0; i < 4; i++) {
            assertNotNull(game.getDeckForPlayer(i));
        }
    }

    @Test
    public void test() {

    }
}
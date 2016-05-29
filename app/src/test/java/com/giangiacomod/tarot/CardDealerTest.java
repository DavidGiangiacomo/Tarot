package com.giangiacomod.tarot;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CardDealerTest {

    private CardDealer cardDealer;
    private Game game;

    @Before
    public void initialization() {
        cardDealer = new CardDealer();
        game = cardDealer.deal();
    }

    @Test
    public void resulted_game_should_have_four_cardDeck_and_a_dog() {
        assertEquals(Dog.class, game.dog().getClass());
        assertEquals(PlayerDeck.class, game.getDeckForPlayer(0).getClass());
        assertEquals(PlayerDeck.class, game.getDeckForPlayer(1).getClass());
        assertEquals(PlayerDeck.class, game.getDeckForPlayer(2).getClass());
        assertEquals(PlayerDeck.class, game.getDeckForPlayer(3).getClass());
    }

    @Test
    public void each_game_dealed_has_eighteen_cards_and_dog_six_card() {
        assertEquals(18, game.getDeckForPlayer(0).getCards().size());
        assertEquals(18, game.getDeckForPlayer(1).getCards().size());
        assertEquals(18, game.getDeckForPlayer(2).getCards().size());
        assertEquals(18, game.getDeckForPlayer(3).getCards().size());
        assertEquals(6, game.dog().getCards().size());
    }

}
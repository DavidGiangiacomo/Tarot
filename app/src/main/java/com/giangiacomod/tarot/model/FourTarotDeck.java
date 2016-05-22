package com.giangiacomod.tarot.model;

public class FourTarotDeck {

    private static final int NB_PLAYER = 4;

    public int getNbPlayer() {
        return NB_PLAYER;
    }

    public Hand[] deal() {
        Hand[] hands = new Hand[NB_PLAYER];
        for (int i = 0; i < NB_PLAYER;  i++) {
            hands[i] = new Hand();
        }
        return hands;
    }
}

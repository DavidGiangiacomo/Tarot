package com.giangiacomod.tarot.model.card;

import java.util.ArrayList;
import java.util.List;

public enum CardSuit {
    HEART, SPADE, DIAMOND, CLUB, TRUMP, FOOL;

    public List<CardValue> cardValues() {
        List<CardValue> result = new ArrayList<>();
        switch(this) {
            case HEART:
            case CLUB:
            case DIAMOND:
            case SPADE:
                result.add(CardValue.ONE);
                result.add(CardValue.TWO);
                result.add(CardValue.THREE);
                result.add(CardValue.FOUR);
                result.add(CardValue.FIVE);
                result.add(CardValue.SIX);
                result.add(CardValue.SEVEN);
                result.add(CardValue.EIGHT);
                result.add(CardValue.NINE);
                result.add(CardValue.TEN);
                result.add(CardValue.JACK);
                result.add(CardValue.KNIGHT);
                result.add(CardValue.QUEEN);
                result.add(CardValue.KING);
                break;
            case FOOL:
                result.add(CardValue.FOOL);
                break;
            case TRUMP:
                result.add(CardValue.ONE);
                result.add(CardValue.TWO);
                result.add(CardValue.THREE);
                result.add(CardValue.FOUR);
                result.add(CardValue.FIVE);
                result.add(CardValue.SIX);
                result.add(CardValue.SEVEN);
                result.add(CardValue.EIGHT);
                result.add(CardValue.NINE);
                result.add(CardValue.TEN);
                result.add(CardValue.ELEVEN);
                result.add(CardValue.TWELVE);
                result.add(CardValue.THIRTEEN);
                result.add(CardValue.FOURTEEN);
                result.add(CardValue.FIFTEEN);
                result.add(CardValue.SIXTEEN);
                result.add(CardValue.SEVENTEEN);
                result.add(CardValue.EIGHTEEN);
                result.add(CardValue.NINETEEN);
                result.add(CardValue.TWENTY);
                result.add(CardValue.TWENTYONE);
                break;
        }
        return result;
    }
}

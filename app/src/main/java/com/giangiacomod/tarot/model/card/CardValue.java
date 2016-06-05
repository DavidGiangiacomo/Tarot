package com.giangiacomod.tarot.model.card;

public enum CardValue {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17),
    EIGHTEEN(18), NINETEEN(19), TWENTY(20), TWENTYONE(21),
    JACK(11), KNIGHT(12), QUEEN(13), KING(14), FOOL(0);

    private final int value;

    CardValue(int value) {
        this.value = value;
    }

    boolean isGreater(CardValue other) {
        return this.value > other.value;
    }
}

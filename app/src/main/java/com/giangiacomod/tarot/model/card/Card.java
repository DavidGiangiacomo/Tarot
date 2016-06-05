package com.giangiacomod.tarot.model.card;

public class Card {

    protected CardValue value;

    protected Card(CardValue value) {
        this.value = value;
    }

    public boolean winsOver(Card card) {
        if (isThereAFoolCard(this, card)) {
            return false;
        }
        if (getClass().equals(card.getClass())) {
            return value.isGreater(card.value);
        }
        if (this instanceof TrumpCard) {
            return true;
        }
        if (card instanceof TrumpCard) {
            return false;
        }
        return true;
    }

    private static boolean isThereAFoolCard(Card card1, Card card2) {
        return card1 instanceof FoolCard || card2 instanceof FoolCard;
    }

    public CardValue getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        return value == card.value;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}

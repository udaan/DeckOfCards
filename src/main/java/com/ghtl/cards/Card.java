package com.ghtl.cards;

/**
 * Card domain class.
 */
public class Card {
    private String rank;
    private String type;

    public Card(String rank, String type) {
        this.rank = rank;
        this.type = type;
    }

    public String getRank() {
        return rank;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return rank + " of " + type;
    }
}

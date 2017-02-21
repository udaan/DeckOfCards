package com.ghtl.cards.loader;

import com.ghtl.cards.Card;

/**
 * Class responsible to create initial set of cards for a Deck.
 */
public class CardLoader implements ICardLoader {
    private final String[] CARD_RANKS = new String[]{"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX",
            "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};

    private final String[] CARD_TYPE = new String[]{"CLUB", "HEART", "DIAMOND", "SPADE"};

    @Override
    public Card[] loadCards() {
        Card[] cards = new Card[52];
        int count = 0;
        for (String cardType : CARD_TYPE) {
            for (String cardRank : CARD_RANKS) {
                cards[count++] = new Card(cardRank, cardType);
            }
        }
        return cards;
    }
}
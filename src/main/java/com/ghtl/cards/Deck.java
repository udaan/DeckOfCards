package com.ghtl.cards;

import com.ghtl.cards.exceptions.InvalidCardException;
import com.ghtl.cards.loader.ICardLoader;
import com.ghtl.cards.shuffle.IShuffler;

import java.util.Random;

/**
 * Class Deck represents Deck of card and provides methods
 * to operate on the collection of cards.
 */
public class Deck {
    private Card[] cards;

    /*
    Deck constructor will load the Deck with initial setup of Cards.
     */
    public Deck(ICardLoader cardLoader) {
        cards = cardLoader.loadCards();
    }

    public Card[] getCards() {
        return cards;
    }

    public void shuffle(IShuffler<Card> shuffler) throws InvalidCardException {

        validateCards();

        shuffler.shuffle(cards);
    }

    private void validateCards() throws InvalidCardException {
        if (cards == null) {
            throw new InvalidCardException("Cards not initialised.");
        }
        //Other validations and suitable error message follows here.
    }
}
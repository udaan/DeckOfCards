package com.ghtl.cards;

import com.ghtl.cards.exceptions.InvalidCardException;
import com.ghtl.cards.loader.CardLoader;
import com.ghtl.cards.shuffle.Shuffler;
import com.ghtl.cards.shuffle.IShuffler;

/**
 * Main process for Deck of Cards program
 */
public class DeckOfCardsConsole {

    public static void main(String[] args) {
        Deck deck = new Deck(new CardLoader());

        //Before shuffle
        Card[] cards = deck.getCards();
        displayCards(cards);

        System.out.println();
        System.out.println("Post shuffle:->");
        System.out.println();

        //Shuffle the cards
        IShuffler<Card> shuffler = new Shuffler<>();

        try {
            //Different shuffling strategies can be applied by passing a shuffler.
            deck.shuffle(shuffler::shuffle);
        } catch (InvalidCardException e) {
            System.out.println("Error shuffling the deck of cards: " + e.getMessage());
            e.printStackTrace();
        }

        //After shuffle
        displayCards(cards);
    }

    private static void displayCards(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(String.format("Position: %2d | Card: %s", i, cards[i]));
        }
    }
}
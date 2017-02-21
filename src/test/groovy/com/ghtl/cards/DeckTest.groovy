package com.ghtl.cards

import com.ghtl.cards.exceptions.InvalidCardException
import com.ghtl.cards.loader.CardLoader
import com.ghtl.cards.loader.ICardLoader
import com.ghtl.cards.shuffle.Shuffler
import com.ghtl.cards.shuffle.IShuffler
import org.junit.Test

/**
 * Test class for Deck
 */
class DeckTest {

    IShuffler<Card> shuffler = new Shuffler<>()

    @Test
    public void testDeckInitialization() {
        def deck = new Deck(new CardLoader())
        assert deck.cards != null
        assert deck.cards.length == 52
        assert deck.cards[0].toString().equals("ACE of CLUB")
    }

    @Test(expected=InvalidCardException.class)
    public void 'Given Deck of cards is created When cards are not loaded And Deck is shuffled Then exception is raised'() {
        def deck = new Deck(new ICardLoader() {
            @Override
            Card[] loadCards() {
                null
            }
        })

        deck.shuffle(shuffler)
    }


    @Test
    public void 'Given Deck of cards is created And loaded When Deck is shuffled Then after shuffle, valid cards exist'() {
        Deck deck = new Deck(new CardLoader())
        //Copy original cards into an array
        def originalCards = deck.cards.collect()
        deck.shuffle(shuffler)

        //test that all 52 shuffled cards are unique
        assert deck.cards.toUnique {a, b -> (a.rank <=> b.rank ?: a.type <=> b.type)}.size() == 52

        //test that all cards from the original cards are present in the shuffled card
        assert originalCards as Set == deck.cards as Set
    }


    @Test
    public void testRepeatShuffle() {
        Deck deck = new Deck(new CardLoader())
        //Copy original cards into an array
        def originalCards = deck.cards.collect()

        deck.shuffle(shuffler)
        deck.shuffle(shuffler)
        deck.shuffle(shuffler)
        deck.shuffle(shuffler)
        deck.shuffle(shuffler)

        assert deck.cards.toUnique {a, b -> (a.rank <=> b.rank ?: a.type <=> b.type)}.size() == 52
        assert originalCards as Set == deck.cards as Set
    }
}

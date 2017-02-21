package com.ghtl.cards.loader

import com.ghtl.cards.Card
import org.junit.Before
import org.junit.Test

/**
 * Test class for CardLoader
 */
class CardLoaderTest {
    ICardLoader cardLoader = new CardLoader()
    Card[] cards

    @Before
    public void setUp() {
        cards = cardLoader.loadCards()
    }

    @Test
    public void 'test that 52 cards are loaded'() {
        assert cards.length == 52
    }

    @Test
    public void 'test that cards have valid data'() {
        assert cards.every {c -> c.rank != null}
        assert cards.every {c -> c.type != null}
    }
}

package com.ghtl.cards

import org.junit.Test

/**
 * Test class for Card
 */
class CardTest {

    @Test
    public void 'card is printed correctly'() {
        def card = new Card('rank', 'type')
        assert card.toString() != null
        assert card.toString().equals('rank of type')
    }
}

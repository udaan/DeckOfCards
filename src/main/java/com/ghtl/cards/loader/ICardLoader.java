package com.ghtl.cards.loader;

import com.ghtl.cards.Card;

/**
 * Interface for loading initial set of cards
 **/
public interface ICardLoader {
    Card[] loadCards();
}
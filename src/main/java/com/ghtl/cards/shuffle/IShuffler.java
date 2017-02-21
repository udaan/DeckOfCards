package com.ghtl.cards.shuffle;

/**
 * Shuffle contract
 */
public interface IShuffler<T> {
    void shuffle(T[] elements);
}

package com.ghtl.cards.shuffle;

import java.util.Random;

/**
 * Implementation for shuffle
 */
public class Shuffler<T> implements IShuffler<T> {
    private Random random = new Random();

    @Override
    public void shuffle(T[] elements) {
        for (int i = elements.length - 1; i >= 1; i--) {
            int randomIndex = random.nextInt(i);
            swap(elements, i, randomIndex);
        }
    }

    private void swap(T[] elements, int i, int newIndex) {
        T temp = elements[i];
        elements[i] = elements[newIndex];
        elements[newIndex] = temp;
    }
}
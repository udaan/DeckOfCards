package com.ghtl.cards.shuffler

import com.ghtl.cards.shuffle.Shuffler
import com.ghtl.cards.shuffle.IShuffler
import org.junit.Test

/**
 * Test class for Shuffler
 */
class ShufflerTest {

    @Test
    public void testNumbersShuffling() {
        def numbers = [1, 2, 3, 4, 5] as Integer[]
        def originalNumbers = numbers.collect()
        IShuffler<Integer> shuffler = new Shuffler<Integer>()
        shuffler.shuffle(numbers)

        assert numbers != null
        assert numbers.length == 5
        assert numbers as Set == originalNumbers as Set
    }
}

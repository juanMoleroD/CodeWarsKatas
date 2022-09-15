package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumToReversedArrayTest {
    ConvertNumToReversedArray Kata = new ConvertNumToReversedArray();

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
        assertArrayEquals(new int[] {0}, Kata.digitize(0));
    }
}

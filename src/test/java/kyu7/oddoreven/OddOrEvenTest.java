package kyu7.oddoreven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {

    OddOrEven Kata = new OddOrEven();

    @Test
    public void exampleTest() {
        assertEquals("odd", Kata.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
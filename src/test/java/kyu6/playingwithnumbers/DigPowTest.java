package kyu6.playingwithnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigPowTest {

    @Test
    void canReturnDigitPower() {
        assertEquals(5, DigPow.getPoweredSum(12,1));
        assertEquals(31, DigPow.getPoweredSum(23,2));
    }

        @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }

}
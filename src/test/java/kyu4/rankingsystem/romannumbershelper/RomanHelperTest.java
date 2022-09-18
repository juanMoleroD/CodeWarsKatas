package kyu4.rankingsystem.romannumbershelper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanHelperTest {

    RomanHelper Kata = new RomanHelper();

    @Test
    void convertsSetRomanToNumbers() {
        assertEquals(1, Kata.toNumber("I"));
        assertEquals(4, Kata.toNumber("IV"));
        assertEquals(5, Kata.toNumber("V"));
        assertEquals(9, Kata.toNumber("IX"));
        assertEquals(10, Kata.toNumber("X"));
        assertEquals(40, Kata.toNumber("XL"));
        assertEquals(50, Kata.toNumber("L"));
    }

    @Test
    void toNumber() {
        assertEquals("I", Kata.toRoman(1));
        assertEquals("IV", Kata.toRoman(4));
        assertEquals("V", Kata.toRoman(5));
        assertEquals("IX", Kata.toRoman(9));
        assertEquals("X", Kata.toRoman(10));
        assertEquals("XL", Kata.toRoman(40));
        assertEquals("L", Kata.toRoman(50));
    }
}
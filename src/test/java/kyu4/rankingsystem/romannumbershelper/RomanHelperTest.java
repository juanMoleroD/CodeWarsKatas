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
        assertEquals(90, Kata.toNumber("XC"));
        assertEquals(100, Kata.toNumber("C"));
        assertEquals(400, Kata.toNumber("CD"));
        assertEquals(500, Kata.toNumber("D"));
        assertEquals(900, Kata.toNumber("CM"));
        assertEquals(1000, Kata.toNumber("M"));
    }

    @Test
    void readsMultipleDigitsInRoman() {
        assertEquals(2, Kata.toNumber("II"));
        assertEquals(3, Kata.toNumber("III"));
        assertEquals(20, Kata.toNumber("XX"));
        assertEquals(24, Kata.toNumber("XXIV"));
        assertEquals(30, Kata.toNumber("XXX"));
        assertEquals(35, Kata.toNumber("XXXV"));
        assertEquals(37, Kata.toNumber("XXXVII"));
        assertEquals(49, Kata.toNumber("XLIX"));
        assertEquals(249, Kata.toNumber("CCXLIX"));
        assertEquals(338, Kata.toNumber("CCCXXXVIII"));
        assertEquals(999, Kata.toNumber("CMXCIX"));
    }

    @Test
    void convertsSetNumbersToRomans() {
        assertEquals("I", Kata.toRoman(1));
        assertEquals("IV", Kata.toRoman(4));
        assertEquals("V", Kata.toRoman(5));
        assertEquals("IX", Kata.toRoman(9));
        assertEquals("X", Kata.toRoman(10));
        assertEquals("XL", Kata.toRoman(40));
        assertEquals("L", Kata.toRoman(50));
        assertEquals("XC", Kata.toRoman(90));
        assertEquals("C", Kata.toRoman(100));
        assertEquals("CD", Kata.toRoman(400));
        assertEquals("D", Kata.toRoman(500));
        assertEquals("CM", Kata.toRoman(900));
        assertEquals("M", Kata.toRoman(1000));
    }

    @Test
    void convertsCompositeNumbersToRoman() {
        assertEquals("II", Kata.toRoman(2));
        assertEquals("III", Kata.toRoman(3));
        assertEquals("IV", Kata.toRoman(4));
        assertEquals("VI", Kata.toRoman(6));
        assertEquals("VIII", Kata.toRoman(8));
        assertEquals("XI", Kata.toRoman(11));
        assertEquals("MMMCCCXXXIII", Kata.toRoman(3333));
        assertEquals("CMLXXVIII", Kata.toRoman(978));
        assertEquals("CMXCIX", Kata.toRoman(999));
        assertEquals("XLI", Kata.toRoman(41));
        assertEquals("XV", Kata.toRoman(15));
    }
}
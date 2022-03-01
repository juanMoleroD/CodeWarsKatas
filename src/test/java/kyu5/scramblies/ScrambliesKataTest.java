package kyu5.scramblies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesKataTest {

    ScrambliesKata testApp = new ScrambliesKata();

    @Test
    void appDetects_LetterNotPresent() {
        assertFalse(testApp.scramble("qwerty", "a"));
    }

    @Test
    void appFinds_FirstLetter() {
        assertTrue(testApp.scramble("qwerty", "t"));
    }

    @Test
    void appFinds_2uniqueLetter() {
        assertTrue(testApp.scramble("qwerty", "tq"));
    }

    @Test
    void appFinds_3uniqueLetter() {
        assertTrue(testApp.scramble("qwerty", "twq"));
    }

    @Test
    void appChecks_2repeatedLetter_Fails() {
        assertFalse(testApp.scramble("qwerty", "tt"));
    }

    @Test
    void appFinds_2repeatedLetter() {
        assertTrue(testApp.scramble("qwertty", "tt"));
    }

}
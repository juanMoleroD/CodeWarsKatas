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
    void appDetects_FirstLetter() {
        assertTrue(testApp.scramble("qwerty", "t"));
    }
}
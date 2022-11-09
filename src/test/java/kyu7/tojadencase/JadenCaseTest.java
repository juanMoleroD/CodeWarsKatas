package kyu7.tojadencase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valid JadenCase String! try again please :)",
                "Most Trees Are Blue",
                jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }
}
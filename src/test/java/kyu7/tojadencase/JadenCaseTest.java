package kyu7.tojadencase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
    public void test() {
        assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"), "toJadenCase doesn't return a valid JadenCase String! try again please :)");
    }

    @Test
    public void testNullArg() {
        assertNull(jadenCase.toJadenCase(null), "Must return null when the arg is null");
    }

    @Test
    public void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""), "Must return null when the arg is empty string");
    }
}
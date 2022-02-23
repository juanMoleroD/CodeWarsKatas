package kyu7.reverseword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void doesFunctionReverseOneWord() {
        Kata kata = new Kata();

        assertEquals("droW", kata.reverseWords("Word"));
    }


}
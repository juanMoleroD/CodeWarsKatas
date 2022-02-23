package kyu7.reverseword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsKataTest {

    @Test
    void doesFunctionReverseOneWord() {
        ReverseWordsKata reverseWordsKata = new ReverseWordsKata();

        assertEquals("droW", reverseWordsKata.reverseWords("Word"));
    }


}
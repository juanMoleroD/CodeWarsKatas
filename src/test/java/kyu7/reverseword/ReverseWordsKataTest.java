package kyu7.reverseword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsKataTest {

    ReverseWordsKata reverseWordsKataTest = new ReverseWordsKata();

    @Test
    void doesFunctionReverseOneWord() {
        assertEquals("droW", reverseWordsKataTest.reverseWords("Word"));
    }

    @Test
    void doesFunctionReverseTwoWords() {
        assertEquals("owT sdrow", reverseWordsKataTest.reverseWords("Two words"));
    }

    @Test
    void doesFunctionReverseFiveWordsAndPunctuation() {
        assertEquals("seoD ti od eviF ?sdroW", reverseWordsKataTest.reverseWords("Does it do Five Words?"));
    }



}
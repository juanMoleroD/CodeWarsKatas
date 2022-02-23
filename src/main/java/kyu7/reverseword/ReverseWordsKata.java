package kyu7.reverseword;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordsKata {

    public String reverseWords(final String original) {
        char[] words = original.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = (words.length -1), j = 0; i >= 0 ; i--,j++){
            result.append(words[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsKata kata = new ReverseWordsKata();
        System.out.println(kata.reverseWords("Words"));
    }


}

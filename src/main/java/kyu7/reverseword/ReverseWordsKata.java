package kyu7.reverseword;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsKata {

    public String reverseWords(final String original) {
        List<String> wordsList = new ArrayList<>(List.of(original.split(" ")));
        StringBuilder reversedWords = new StringBuilder();

        for (int i = 0; i < wordsList.size(); i++) {
            char[] currentWord = wordsList.get(i).toCharArray();

            for (int x = (currentWord.length -1), j = 0; x >= 0 ; x--,j++){
                reversedWords.append(currentWord[x]);
            }
            reversedWords.append(" ");

        }

        return reversedWords.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsKata kata = new ReverseWordsKata();
        System.out.println(kata.reverseWords("Two words"));
    }


}

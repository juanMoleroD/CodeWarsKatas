package kyu6.countingduplicates;

import java.util.List;
import java.util.ArrayList;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int indexOfFirsOccurrenceOfCurrentChar = text.toLowerCase().indexOf(text.toLowerCase().charAt(i));
            if (i != indexOfFirsOccurrenceOfCurrentChar && !list.contains(text.toLowerCase().charAt(i)))
                list.add(text.toLowerCase().charAt(i));
        }
        return list.size();
    }
}

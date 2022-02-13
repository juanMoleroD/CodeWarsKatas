package kyu7.descendingorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public int sortDesc(final int num) {
        //Your code
        List<Integer> numberList = new ArrayList<>();
        char[] numberArray = Integer.toString(num).toCharArray();

        for (char number: numberArray) {
            numberList.add(Character.getNumericValue(number));
        }

        numberList.sort(Collections.reverseOrder());

        StringBuilder sortedNumberString = new StringBuilder();
        for (Integer number: numberList) {
            sortedNumberString.append(number);
        }

        return Integer.parseInt(sortedNumberString.toString());
    }

    public static void main(String[] args) {
        DescendingOrder app = new DescendingOrder();
        app.sortDesc(32145);
    }
}

package kyu7.sumofnumbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbersKata {

    public int getSum(int a, int b) {
        if (a == b) return a;
        int lower, higher;
        if (a >= b) {
            higher = a;
            lower = b;
        } else {
            higher = b;
            lower = a;
        }

        return IntStream.rangeClosed(lower,higher).sum();
    }

}

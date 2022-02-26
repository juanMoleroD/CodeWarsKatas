package kyu7.sumofnumbers;

import java.util.stream.IntStream;

public class SumOfNumbersKata {

    public int getSum(int a, int b) {
        if (a == b) return a;
        int lower = Math.min(a,b);
        int higher = Math.max(a,b);

        return IntStream.rangeClosed(lower,higher).sum();
    }

}

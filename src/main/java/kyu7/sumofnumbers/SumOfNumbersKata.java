package kyu7.sumofnumbers;

import java.util.List;
import java.util.function.IntFunction;
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

        List<Integer> numbers = IntStream.rangeClosed(lower,higher)
                .mapToObj(number -> number)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer number : numbers) sum += number;

        return sum;
    }

}

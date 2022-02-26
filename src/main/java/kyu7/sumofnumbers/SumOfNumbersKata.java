package kyu7.sumofnumbers;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbersKata {

    public int getSum(int a, int b) {
        List<Integer> numbers = IntStream.rangeClosed(a,b)
                .mapToObj(number -> number)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer number : numbers) sum += number;

        return sum;
    }

}

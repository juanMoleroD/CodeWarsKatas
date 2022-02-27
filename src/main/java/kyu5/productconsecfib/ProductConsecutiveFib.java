package kyu5.productconsecfib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ProductConsecutiveFib {

    public static long[] productFib(long prod) {
        // your code

        List<Long> fibonacci = new ArrayList<>(Arrays.asList(1L,1L));

        for(int i = 1; i < Math.sqrt(prod); i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i));

            long current = fibonacci.get(i+1);
            long previous = fibonacci.get(i);

            if (current * previous == prod) {
                return new long[]{previous, current, 1};
            }
        }



        return new long[]{1, 1, 1};

    }

}

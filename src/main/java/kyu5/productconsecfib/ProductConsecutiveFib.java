package kyu5.productconsecfib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductConsecutiveFib {

    public static long[] productFib(long prod) {
        List<Long> fibonacci = new ArrayList<>(Arrays.asList(1L,1L));
        double loopLimit = Math.sqrt(prod);

        for (int i = 1; i < loopLimit; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i));

            long current = fibonacci.get(i+1);
            long previous = fibonacci.get(i);

            if (current * previous < prod) continue;

            if (current * previous == prod) {
                return new long[]{previous, current, 1};
            } else return new long[]{previous, current, 0};
        }

        return new long[]{1, 1, 1};
    }
}

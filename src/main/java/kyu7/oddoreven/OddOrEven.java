package kyu7.oddoreven;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        // your code
        int sum = Arrays.stream(array).sum();
        return sum % 2 == 0 ? "even": "odd" ;
    }
}

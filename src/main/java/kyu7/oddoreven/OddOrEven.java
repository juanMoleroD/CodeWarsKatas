package kyu7.oddoreven;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = java.util.Arrays.stream(array).sum();
        return sum % 2 == 0 ? "even": "odd" ;
    }
}

package kyu6;

import java.util.*;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> dict = new HashMap<>();
        Arrays.stream(a).forEach(element -> {
            if (dict.containsKey(element)) {
                dict.replace(element, dict.get(element) + 1);
            } else {
                dict.put(element, 1);
            }
        });
        Map<Integer, Integer> result = dict.entrySet().stream()
                                        .filter(entry -> entry.getValue() % 2 != 0)
                                        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        return Integer.parseInt(result.keySet().toArray()[0].toString());
    }
    // using XOR bitwise operator
    public static int findIt2(int[] A) {
        int xor = 0;
        System.out.println("xor starts at 0");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Loop number " + (i+1));
            System.out.println("xor is at " + xor + " and the current array Value is " + A[i]);
            xor ^= A[i];
            System.out.println("After xor ^= A[i], xor is at " + xor);
            System.out.println();
        }
        return xor;
    }
}

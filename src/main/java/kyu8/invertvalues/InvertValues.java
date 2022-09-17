package kyu8.invertvalues;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(number -> -number).toArray();
    }
}

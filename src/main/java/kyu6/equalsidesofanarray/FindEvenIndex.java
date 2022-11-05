package kyu6.equalsidesofanarray;

import java.util.Arrays;

public class FindEvenIndex {
    public int findEvenIndex(int[] arr) {
        // your code
        int[] arrReversed = new int[arr.length];
        for (int i = arr.length -1, j = 0; j < arr.length ; i--, j++) arrReversed[j] = arr[i];

        for(int i = 0; i < arr.length; i++) {
            if (sumUpToIndex(i, arr) == sumUpToIndex(arr.length-1 - i, arrReversed)) return i;
        }
        return -1;
    }

    int sumUpToIndex(int index, int[] array) {
        return Arrays.stream(array).limit(index).sum();
    }
}

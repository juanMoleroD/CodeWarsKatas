package kyu3.makeaspiral;

import java.util.Arrays;

public class Spiralizor {
    public  int[][] spiralize(int size) {
        int[][] result = getStartingArray(size);
        Arrays.fill(result[0], 1);


        return result;
    }

    int[][] getStartingArray(int size) {
        int[][] result = new int[size][size];
        Arrays.stream(result).forEach(arr -> Arrays.fill(arr, 0));
        return result;
    }





}

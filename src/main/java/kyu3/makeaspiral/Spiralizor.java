package kyu3.makeaspiral;

import java.util.Arrays;

public class Spiralizor {
    public  int[][] spiralize(int size) {
        int[][] result = getStartingArray(size);
        Arrays.fill(result[0], 1);
        Arrays.stream(result).forEach(arr -> arr[size-1] = 1);
        Arrays.fill(result[size-1], 1);
//        for(int i = size -1; i > 0; i--) {
//            if(result[i][])
//            result[i][0] = 1;
//        }

        return result;
    }

    int[][] getStartingArray(int size) {
        int[][] result = new int[size][size];
        Arrays.stream(result).forEach(arr -> Arrays.fill(arr, 0));
        return result;
    }





}

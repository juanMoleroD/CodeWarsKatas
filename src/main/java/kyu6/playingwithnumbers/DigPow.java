package kyu6.playingwithnumbers;

import java.util.Arrays;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code
        return checkForPotentialMultiple(n, getPoweredSum(n, p));
    }

    static long getPoweredSum(int n, int p) {
        String[] nums = String.valueOf(n).split("");
        long result = 0;
        for (int i = 0; i< nums.length; i++) result += Math.pow(Integer.parseInt(nums[i]), i + p);
        return result;
    }

    static long checkForPotentialMultiple(int n, long powSum) {
        long result = -1;
        for (long i = 1; i * n <= powSum; i++) if ( i * n == powSum) result = i;
        return result;
    }

}

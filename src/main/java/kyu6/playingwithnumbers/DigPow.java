package kyu6.playingwithnumbers;

import java.util.Arrays;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code
        return checkForPotentialMultiple(n, getPoweredSum(n, p));
    }

    static long getPoweredSum(int n, int p) {
        String num = String.valueOf(n);
        String[] nums = num.split("");
        long result = 0;
        for(int i = 0; i< nums.length; i++) {
            result += Math.pow(Integer.parseInt(nums[i]), i + p);
        }
        return result;
    }

    static long checkForPotentialMultiple(int n, long powSum) {
        long result = -1;

        for (int i = 1; i * n <= powSum; i++) {
            long current = i * n;
            if ( current == powSum) result = i;
        }

        return result;
    }

}

package kyu6.playingwithnumbers;

import java.util.Arrays;

public class DigPow {
    public static long digPow(int n, int p) {
        // your code
        return -1;
    }

    static long getPoweredSum(int n, int p) {
        String num = String.valueOf(n);
        String[] nums = num.split("");
        System.out.println(Arrays.toString(nums));
        long result = 0;
        for(int i = 0; i< nums.length; i++) {
            result += Math.pow(Integer.parseInt(nums[i]), i + p);
        }
        return result;
    }

}

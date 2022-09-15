package kyu8;

public class ConvertNumToReversedArray {
    public static int[] digitize(long numberToReverse) {
        // Code here
        StringBuilder numberToString = new StringBuilder(Long.toString(numberToReverse));
        numberToString.reverse();

        int[] result = new int[numberToString.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Character.getNumericValue(numberToString.charAt(i));
        }
        return result;
    }

    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}

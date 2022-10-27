package kyu5.finduniquenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.Collectors;

public class FindUnique {

    public double findUniq(double[] arr) {
        // Do the magic
        List<Double> firstThree = new ArrayList<>();
        Arrays.stream(arr).limit(3).forEach(firstThree::add);

        if(firstThreeNumbersAreEqual(firstThree)) {
            Double repeatedNumber = firstThree.get(0);
            return Arrays.stream(arr)
                    .distinct()
                    .filter(theDistinctNumberFrom(repeatedNumber))
                    .findFirst()
                    .getAsDouble();

        } else if (firstTwoAreEqual(firstThree)) {
            return firstThree.get(2);
        } else if (lastTwoAreEqual(firstThree)) {
            return firstThree.get(0);
        } else {
            return firstThree.get(1);
        }
    }

    private static boolean lastTwoAreEqual(List<Double> firstThree) {
        return firstThree.get(2).equals(firstThree.get(1));
    }

    private static boolean firstTwoAreEqual(List<Double> firstThree) {
        return firstThree.get(0).equals(firstThree.get(1));
    }

    private DoublePredicate theDistinctNumberFrom(Double repeatedNumber) {
        return num -> num != repeatedNumber;
    }

    private boolean firstThreeNumbersAreEqual(List<Double> numbers) {
        return numbers.get(0).equals(numbers.get(1)) && numbers.get(2).equals(numbers.get(1));
    }


}

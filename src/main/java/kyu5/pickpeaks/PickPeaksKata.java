package kyu5.pickpeaks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PickPeaksKata {

    public Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!
        List<Integer> positions = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        int lastValue = arr[0];

        for (int posIndex = 1; posIndex < arr.length -1; posIndex++) {
            int currentInt = arr[posIndex];

            if (currentInt > lastValue) {
                if (currentInt >= arr[posIndex + 1]) {
                    if (smallerIntAhead(posIndex,currentInt,arr)) {
                        positions.add(posIndex);
                        peaks.add(arr[posIndex]);
                        lastValue = currentInt;
                    }
                }
            }
        }

        return Map.of("pos", positions,"peaks", peaks);
    }

    private boolean smallerIntAhead(int index, int currentValue, int[] arr) {
        for(int i = (1 + index); i < arr.length ; i++) {
            if (currentValue < arr[i]) return false;
            if (currentValue == arr[i]) continue;
            if (currentValue > arr[i]) return true;
        } return false;
    }

}

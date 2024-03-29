package kyu5.pickpeaks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PickPeaksKata {

    public Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> positions = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        for (int posIndex = 1; posIndex < arr.length -1; posIndex++) {
            int currentInt = arr[posIndex];
            int lastValue = arr[posIndex - 1];

            if (currentInt > lastValue && currentInt >= arr[posIndex + 1]) {
                if (smallerIntAhead(posIndex, currentInt, arr)) {
                    positions.add(posIndex);
                    peaks.add(arr[posIndex]);
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

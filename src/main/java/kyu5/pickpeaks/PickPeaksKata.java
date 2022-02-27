package kyu5.pickpeaks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PickPeaksKata {

    public Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!
        List<Integer> positions = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();





        return Map.of("pos", positions,"peaks", peaks);
    }

    public static void main(String[] args) {

        PickPeaksKata app = new PickPeaksKata();

    }
}

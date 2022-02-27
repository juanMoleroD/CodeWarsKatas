package kyu5.pickpeaks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PickPeaksKataTest {

    PickPeaksKata app = new PickPeaksKata();

    @Test
    void returnsEmptyIfNoPeaks() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(),"peaks", List.of());
        int[] testArray = {1,1,1,1,1};
        assertEquals(result, app.getPeaks(testArray));
    }

    @Test
    void finds1Peak() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(1),"peaks", List.of(2));
        int[] testArray = {1,2,1};
        assertEquals(result, app.getPeaks(testArray));
    }

    @Test
    void finds2Peaks() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(1,3),"peaks", List.of(2,2));
        int[] testArray = {1,2,1,2,1};
        assertEquals(result, app.getPeaks(testArray));
    }

    @Test
    void finds2PeaksWith1Plateau() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(1,4),"peaks", List.of(2,3));
        int[] testArray = {1,2,2,1,3,1};
        assertEquals(result, app.getPeaks(testArray));
    }

    @Test
    void finds3PeaksWith2Plateaus() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(1,4,11),"peaks", List.of(2,3,5));
        int[] testArray = {1,2,1,2,3,3,2,3,3,4,4,5,4};
        assertEquals(result, app.getPeaks(testArray));
    }

    @Test
    void findsPeakAndIgnoresLastDigitPeak() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(3),"peaks", List.of(4));
        int[] testArray = {1,2,3,4,3,2,3};
        assertEquals(result, app.getPeaks(testArray));
    }
}
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
}
package kyu5.pickpeaks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PickPeaksKataTest {

    PickPeaksKata app = new PickPeaksKata();

    @Test
    void getPeaks() {
        Map<String, List<Integer>> result = Map.of("pos", List.of(1),"peaks", List.of(2));
        int[] testArray = {1,2,1};
        assertEquals(result, app.getPeaks(testArray));
    }
}
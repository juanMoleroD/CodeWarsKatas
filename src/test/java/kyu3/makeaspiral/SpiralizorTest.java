package kyu3.makeaspiral;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpiralizorTest {

    Spiralizor spiralizor = new Spiralizor();

    @Test
    void returnsArrayMatrixOfSizeFilledWith0() {
        int[][] expected = new int[][] {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        assertArrayEquals(expected, spiralizor.getStartingArray(5));
    }

    @Test
    void firstLineIsFilledWith1s() {
        int[][] expected = new int[][] {
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        assertArrayEquals(expected[0], spiralizor.spiralize(5)[0]);
    }

    @Test
    void lastColumnGetsFilled() {
        int[][] expected = new int[][] {
                {1,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1}
        };
        assertEquals(expected[0][4], 1);
        assertEquals(expected[1][4], 1);
        assertEquals(expected[2][4], 1);
        assertEquals(expected[3][4], 1);
        assertEquals(expected[4][4], 1);
    }

    //    @Test
    public void test5() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 }
                },
                spiralizor.spiralize(5));
    }

//    @Test
    public void test8() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                },
                spiralizor.spiralize(8));
    }
}
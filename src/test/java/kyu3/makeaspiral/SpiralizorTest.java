package kyu3.makeaspiral;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpiralizorTest {

    Spiralizor spiralizor = new Spiralizor();
    int[][] size5Result = spiralizor.spiralize(5);

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
    void firstRowIsFilledWith1s() {
        int[][] expected = new int[][] {
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        assertArrayEquals(expected[0], size5Result[0]);
    }

    @Test
    void lastColumnGetsFilled() {
        assertEquals(1, size5Result[0][4]);
        assertEquals(1, size5Result[1][4]);
        assertEquals(1, size5Result[2][4]);
        assertEquals(1, size5Result[3][4]);
        assertEquals(1, size5Result[4][4]);
    }


    @Test
    void BottomRowGetsFilled() {
        for (int i = 0; i < 5; i++){
            assertEquals(1, size5Result[4][i]);
        }
    }

    @Test
    void fillsFirstColumnWithoutTouchingTopRow() {
        assertEquals(0, size5Result[1][0]);
        assertEquals(1, size5Result[2][0]);
        assertEquals(1, size5Result[3][0]);
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
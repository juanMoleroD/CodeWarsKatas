package kyu7.sumofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersKataTest {

    SumOfNumbersKata app = new SumOfNumbersKata();

    @Test
    void ifBothEqual_returnsZero() {
        assertEquals(0, app.getSum(1,1));
        assertEquals(0, app.getSum(-1,-1));
        assertEquals(0, app.getSum(0,0));
        assertEquals(0, app.getSum(69,69));
    }

    @Test
    void whenBothNegative_returnsSumOfNumbersInBetween() {
        assertEquals(1, app.getSum(0,1));
        assertEquals(10, app.getSum(1,4));
        assertEquals(20, app.getSum(2,6));
    }

    @Test
    void oneNegative_returnsSumOfNumbersInBetween() {
        assertEquals(2, app.getSum(-1,2));
        assertEquals(2, app.getSum(2,-1));
        assertEquals(4, app.getSum(-3,4));
        assertEquals(4, app.getSum(4,-3));
    }

    @Test
    void bothNegative_returnsSumOfNumbersInBetween() {
        assertEquals(-6, app.getSum(-1,-3));
        assertEquals(-3, app.getSum(-2,-1));
        assertEquals(-20, app.getSum(-2,-6));
        assertEquals(-21, app.getSum(-10,-11));
    }

}
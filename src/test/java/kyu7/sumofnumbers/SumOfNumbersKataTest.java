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


}
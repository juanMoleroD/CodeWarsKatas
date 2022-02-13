package kyu7;

import kyu7.descendingorder.DescendingOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    DescendingOrder testClass = new DescendingOrder();

    @Test
    void sortDesc() {
        assertEquals(54321, testClass.sortDesc(23145));
    }
}
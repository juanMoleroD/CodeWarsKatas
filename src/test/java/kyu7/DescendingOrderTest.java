package kyu7;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    DescendingOrder testClass = new DescendingOrder();

    @Test
    void sortDesc() {
        assertEquals(54321, testClass.sortDesc(23145));
    }
}
package kyu5.productconsecfib;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductConsecutiveFibTest {

    ProductConsecutiveFib app = new ProductConsecutiveFib();

    @Test
    void calculatesFirstPair() {
        long[] testResult = {21,34,1};
        assertArrayEquals(testResult, app.productFib(714));

    }
}
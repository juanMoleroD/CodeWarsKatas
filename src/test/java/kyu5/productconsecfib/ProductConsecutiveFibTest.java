package kyu5.productconsecfib;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductConsecutiveFibTest {

    ProductConsecutiveFib app = new ProductConsecutiveFib();

    @Test
    void calculatesFirstPair_Existing() {
        long[] testResult = {21,34,1};
        assertArrayEquals(testResult, app.productFib(714));
    }

    @Test
    void calculatePair_Existing() {
        long[] testResult = {55, 89, 1};
        assertArrayEquals(testResult, app.productFib(4895));
    }

    @Test
    void calculatePair_notExisting() {
        long[] testResult = {55, 89, 0};
        long[] testResult_2 = {89, 144, 0};
        assertArrayEquals(testResult, app.productFib(4000));
        assertArrayEquals(testResult_2, app.productFib(5895));
    }

}
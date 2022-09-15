package kyu6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XbonacciTest {

    private Xbonacci variabonacci;

    @BeforeEach
    void setUp() {
        variabonacci = new Xbonacci();
    }

    @AfterEach
    void tearDown() {
        variabonacci = null;
    }
    private double precision = 1e-10;

    @Test
    void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5}, variabonacci.tribonacci(new double []{1,1,1},5), precision);
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
    }
}
package problem0002_evenFibonacciSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenFibonacciSumTest {

    @Test
    void testCalculateSum() {
        assertEquals(2, evenFibonacciSum.calculateSum(5));
        assertEquals(10, evenFibonacciSum.calculateSum(10));
        assertEquals(44, evenFibonacciSum.calculateSum(100));
        assertEquals(188, evenFibonacciSum.calculateSum(200));
        assertEquals(798, evenFibonacciSum.calculateSum(1000));
    }
}
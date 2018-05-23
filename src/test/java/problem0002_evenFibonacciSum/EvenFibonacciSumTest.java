package problem0002_evenFibonacciSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFibonacciSumTest {

    @Test
    void testCalculateSum() {
        assertEquals(2, EvenFibonacciSum.calculateSum(5));
        assertEquals(10, EvenFibonacciSum.calculateSum(10));
        assertEquals(44, EvenFibonacciSum.calculateSum(100));
        assertEquals(188, EvenFibonacciSum.calculateSum(200));
        assertEquals(798, EvenFibonacciSum.calculateSum(1000));
    }
}
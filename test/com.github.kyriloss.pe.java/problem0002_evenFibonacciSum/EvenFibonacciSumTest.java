package problem0002_evenFibonacciSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFibonacciSumTest {

    @Test
    void testCalculate() {
        assertEquals(2, EvenFibonacciSum.calculate(5));
        assertEquals(10, EvenFibonacciSum.calculate(10));
        assertEquals(44, EvenFibonacciSum.calculate(100));
        assertEquals(188, EvenFibonacciSum.calculate(200));
        assertEquals(798, EvenFibonacciSum.calculate(1000));
    }
}
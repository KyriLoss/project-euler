package com.github.kyriloss.pe.problem0002_evenFibonacciSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFibonacciSumTest {

    @Test
    void testCalculateEvenFibonacciSum() {
        Assertions.assertEquals(2, EvenFibonacciSum.calculateEvenFibonacciSum(5));
        assertEquals(10, EvenFibonacciSum.calculateEvenFibonacciSum(10));
        assertEquals(44, EvenFibonacciSum.calculateEvenFibonacciSum(100));
        assertEquals(188, EvenFibonacciSum.calculateEvenFibonacciSum(200));
        assertEquals(798, EvenFibonacciSum.calculateEvenFibonacciSum(1000));
    }
}
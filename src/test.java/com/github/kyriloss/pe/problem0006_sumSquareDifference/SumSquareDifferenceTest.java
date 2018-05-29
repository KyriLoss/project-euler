package com.github.kyriloss.pe.problem0006_sumSquareDifference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSquareDifferenceTest {

    @Test
    void testSumN() {
        Assertions.assertEquals(5050, SumSquareDifference.sumN(100));
    }

    @Test
    void testSumN2() {
        assertEquals(338350, SumSquareDifference.sumN2(100));
    }

    @Test
    void testCalculateSumSquareDifference() {
        assertEquals(22, SumSquareDifference.calculateSumSquareDifference(3));
        assertEquals(2640, SumSquareDifference.calculateSumSquareDifference(10));
    }
}
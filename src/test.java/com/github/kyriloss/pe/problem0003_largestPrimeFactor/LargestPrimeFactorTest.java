package com.github.kyriloss.pe.problem0003_largestPrimeFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @Test
    void testFindLargestPrimeFactor() {
        assertEquals(2, LargestPrimeFactor.findLargestPrimeFactor(16));
        assertEquals(2, LargestPrimeFactor.findLargestPrimeFactor(4096));
        assertEquals(2, LargestPrimeFactor.findLargestPrimeFactor((long) Math.pow(2, 32)));

        assertEquals(3, LargestPrimeFactor.findLargestPrimeFactor(9));
        assertEquals(3, LargestPrimeFactor.findLargestPrimeFactor(18));
        assertEquals(5, LargestPrimeFactor.findLargestPrimeFactor(25));

        assertEquals(11, LargestPrimeFactor.findLargestPrimeFactor(11));
        assertEquals(179424673, LargestPrimeFactor.findLargestPrimeFactor(179424673));
        assertEquals(29996224275833L, LargestPrimeFactor.findLargestPrimeFactor(29996224275833L));

        assertEquals(5, LargestPrimeFactor.findLargestPrimeFactor(10));
        assertEquals(29, LargestPrimeFactor.findLargestPrimeFactor(13195));
        assertEquals(6857,LargestPrimeFactor.findLargestPrimeFactor(600851475143L));

    }
}
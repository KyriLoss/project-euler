package com.github.kyriloss.pe.problem0007_NthPrime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthPrimeTest {

    @Test
    void testFindNthPrime() {
        assertEquals(2, NthPrime.findNthPrime(1));
        assertEquals(3, NthPrime.findNthPrime(2));
        assertEquals(5, NthPrime.findNthPrime(3));
        assertEquals(7, NthPrime.findNthPrime(4));
        assertEquals(11, NthPrime.findNthPrime(5));
        assertEquals(13, NthPrime.findNthPrime(6));

        assertEquals(17, NthPrime.findNthPrime(7));
        assertEquals(19, NthPrime.findNthPrime(8));
        assertEquals(23, NthPrime.findNthPrime(9));

        assertEquals(233, NthPrime.findNthPrime(51));
        assertEquals(1229, NthPrime.findNthPrime(201));
        assertEquals(7927, NthPrime.findNthPrime(1001));
        assertEquals(17393, NthPrime.findNthPrime(2001));
        assertEquals(48619, NthPrime.findNthPrime(5001));

        assertEquals(104743, NthPrime.findNthPrime(10001));

    }
}
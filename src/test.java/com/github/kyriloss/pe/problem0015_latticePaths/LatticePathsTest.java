package com.github.kyriloss.pe.problem0015_latticePaths;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class LatticePathsTest {

    @Test
    void testFactorial() {
        assertEquals(BigInteger.ONE, LatticePaths.factorial(1));
        assertEquals(BigInteger.valueOf(2), LatticePaths.factorial(2));
        assertEquals(BigInteger.valueOf(6), LatticePaths.factorial(3));
        assertEquals(BigInteger.valueOf(24), LatticePaths.factorial(4));
    }

    @Test
    void testNumberOfPaths() {
        assertEquals("6", LatticePaths.numberOfPaths(2, 2));
        assertEquals("10", LatticePaths.numberOfPaths(3, 2));
        assertEquals("159835829", LatticePaths.numberOfPaths(500, 500));
    }
}
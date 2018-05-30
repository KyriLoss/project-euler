package com.github.kyriloss.pe.problem0008_largestKProductInN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestKProductInNTest {

    @Test
    void testCalculateLargestKProductInN() {
        assertEquals("60", LargestKProductInN.calculateLargestKProductInN(5, 3, "12345"));
        assertEquals("3150", LargestKProductInN.calculateLargestKProductInN(10, 5, "3675356291"));
        assertEquals("0", LargestKProductInN.calculateLargestKProductInN(10, 5, "2709360626"));

    }
}
package com.github.kyriloss.pe.problem0001_35multiplesSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Multiples35SumTest {

    @Test
    void testCalculateMultiples35Sum() {
        assertEquals(23, Multiples35Sum.calculateMultiples35Sum(10));
        assertEquals(2318, Multiples35Sum.calculateMultiples35Sum(100));
    }

}
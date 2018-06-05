package com.github.kyriloss.pe.problem0012_triangularNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangularNumberTest {
    @Test
    void testNumberOfDivisors() {
        assertEquals(1, TriangularNumber.numberOfDivisors(1));
        assertEquals(2, TriangularNumber.numberOfDivisors(2));
        assertEquals(2, TriangularNumber.numberOfDivisors(3));
        assertEquals(4, TriangularNumber.numberOfDivisors(6));
        assertEquals(4, TriangularNumber.numberOfDivisors(10));
        assertEquals(4, TriangularNumber.numberOfDivisors(15));
        assertEquals(4, TriangularNumber.numberOfDivisors(21));
        assertEquals(6, TriangularNumber.numberOfDivisors(28));

        assertEquals(9, TriangularNumber.numberOfDivisors(36));
        assertEquals(7, TriangularNumber.numberOfDivisors(64));
        assertEquals(5, TriangularNumber.numberOfDivisors(81));
        assertEquals(15, TriangularNumber.numberOfDivisors(144));

        assertEquals(1024, TriangularNumber.numberOfDivisors(842161320));
    }

    @Test
    void testFindNumber() {
        assertEquals(3, TriangularNumber.findNumber(1));
        assertEquals(6, TriangularNumber.findNumber(2));
        assertEquals(6, TriangularNumber.findNumber(3));
        assertEquals(28, TriangularNumber.findNumber(4));
        assertEquals(36, TriangularNumber.findNumber(8));

        assertEquals(120, TriangularNumber.findNumber(10));

        assertEquals(2016, TriangularNumber.findNumber(28));

        assertEquals(73920, TriangularNumber.findNumber(100));
        assertEquals(2031120, TriangularNumber.findNumber(200));
        assertEquals(76576500, TriangularNumber.findNumber(500));

        for (int i = 0; i < 10; i++) {
            assertEquals(842161320, TriangularNumber.findNumber(1000));
        }
    }
}
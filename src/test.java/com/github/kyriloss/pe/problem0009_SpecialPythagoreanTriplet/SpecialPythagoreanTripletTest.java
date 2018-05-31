package com.github.kyriloss.pe.problem0009_SpecialPythagoreanTriplet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialPythagoreanTripletTest {

    @Test
    void testCalculateProductOfPythagoreanTripletWithSumN() {
        assertEquals(-1, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(4));

        assertEquals(60, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(12));
        assertEquals(780, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(30));

        assertEquals(20580, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(84));
        assertEquals(5678340, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(646));

        assertEquals(-1, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(13));
        assertEquals(-1, SpecialPythagoreanTriplet.calculateProductOfPythagoreanTripletWithSumN(85));

    }
}
package com.github.kyriloss.pe.problem0020_factorialDigitSum;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialDigitSumTest {

    @Test
    void testFactorial() {
        assertEquals("1", FactorialDigitSum.factorial(BigInteger.ZERO).toString());
        assertEquals("1", FactorialDigitSum.factorial(BigInteger.ONE).toString());
        assertEquals("3628800", FactorialDigitSum.factorial(BigInteger.TEN).toString());
    }

    @Test
    void testSumOfDigits() {
        assertEquals(0, FactorialDigitSum.sumOfDigits(BigInteger.ZERO));
        assertEquals(1, FactorialDigitSum.sumOfDigits(BigInteger.ONE));
        assertEquals(1, FactorialDigitSum.sumOfDigits(BigInteger.TEN));

        assertEquals(6, FactorialDigitSum.sumOfDigits(BigInteger.valueOf(123)));
        assertEquals(15, FactorialDigitSum.sumOfDigits(BigInteger.valueOf(456)));
        assertEquals(24, FactorialDigitSum.sumOfDigits(BigInteger.valueOf(789)));

        assertEquals(1, FactorialDigitSum
                .sumOfDigits(FactorialDigitSum.factorial(BigInteger.ZERO)));
        assertEquals(1, FactorialDigitSum
                .sumOfDigits(FactorialDigitSum.factorial(BigInteger.ONE)));
        assertEquals(27, FactorialDigitSum
                .sumOfDigits(FactorialDigitSum.factorial(BigInteger.TEN)));

    }
}
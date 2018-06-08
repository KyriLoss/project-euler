package com.github.kyriloss.pe.problem0016_powerDigitSum;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PowerDigitSumTest {

    @Test
    void testSumOfDigits() {
        assertEquals(8, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(3)));
        assertEquals(7, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(4)));
        assertEquals(11, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(7)));

        assertEquals(8, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(9)));
        assertEquals(107, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(99)));
        assertEquals(1367, PowerDigitSum.sumOfDigits(BigInteger.valueOf(2).pow(999)));
    }
}
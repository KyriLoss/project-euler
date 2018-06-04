package com.github.kyriloss.pe.problem0010_sumOfPrimes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPrimesTest {
    private static int[] primes = new int[10000000];

    @BeforeEach
    void setUp() {
        primes = SumOfPrimes.primesToN(9999999);
    }

    @Test
    void testCalculateSumOfPrimes() {
        assertEquals(2, SumOfPrimes.calculateSumOfPrimes(primes,2));
        assertEquals(5, SumOfPrimes.calculateSumOfPrimes(primes,3));
        assertEquals(5, SumOfPrimes.calculateSumOfPrimes(primes,4));
        assertEquals(10, SumOfPrimes.calculateSumOfPrimes(primes,5));
        assertEquals(10, SumOfPrimes.calculateSumOfPrimes(primes,6));
        assertEquals(17, SumOfPrimes.calculateSumOfPrimes(primes,7));
        assertEquals(17, SumOfPrimes.calculateSumOfPrimes(primes,8));
        assertEquals(17, SumOfPrimes.calculateSumOfPrimes(primes,9));
        assertEquals(17, SumOfPrimes.calculateSumOfPrimes(primes,10));
        assertEquals(28, SumOfPrimes.calculateSumOfPrimes(primes,11));
        assertEquals(28, SumOfPrimes.calculateSumOfPrimes(primes,12));

        assertEquals(41, SumOfPrimes.calculateSumOfPrimes(primes,13));
        assertEquals(41, SumOfPrimes.calculateSumOfPrimes(primes,14));
        assertEquals(41, SumOfPrimes.calculateSumOfPrimes(primes,15));
        assertEquals(41, SumOfPrimes.calculateSumOfPrimes(primes,16));

        assertEquals(58, SumOfPrimes.calculateSumOfPrimes(primes,17));
        assertEquals(58, SumOfPrimes.calculateSumOfPrimes(primes,18));

        assertEquals(1060, SumOfPrimes.calculateSumOfPrimes(primes,100));

        assertEquals(21536, SumOfPrimes.calculateSumOfPrimes(primes,500));

        assertEquals(76127, SumOfPrimes.calculateSumOfPrimes(primes,1000));
        assertEquals(5736396, SumOfPrimes.calculateSumOfPrimes(primes,10000));
        assertEquals(454396537, SumOfPrimes.calculateSumOfPrimes(primes,100000));

        assertEquals(37550402023L, SumOfPrimes.calculateSumOfPrimes(primes,1000000));
        assertEquals(142913828922L, SumOfPrimes.calculateSumOfPrimes(primes,2000000));
        assertEquals(312471072265L, SumOfPrimes.calculateSumOfPrimes(primes,3000000));
        assertEquals(544501644261L, SumOfPrimes.calculateSumOfPrimes(primes,4000000));
        assertEquals(838596693108L, SumOfPrimes.calculateSumOfPrimes(primes,5000000));
        assertEquals(1192390967254L, SumOfPrimes.calculateSumOfPrimes(primes,6000000));
        assertEquals(1607061425171L, SumOfPrimes.calculateSumOfPrimes(primes,7000000));
        assertEquals(2080483502248L, SumOfPrimes.calculateSumOfPrimes(primes,8000000));
        assertEquals(2613521583098L, SumOfPrimes.calculateSumOfPrimes(primes,9000000));

        assertEquals(3203324994356L, SumOfPrimes.calculateSumOfPrimes(primes,9999999));
    }

}
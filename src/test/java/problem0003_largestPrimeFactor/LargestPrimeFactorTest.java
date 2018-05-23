package problem0003_largestPrimeFactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @Test
    void testFind() {
        assertEquals(2, LargestPrimeFactor.find(16));
        assertEquals(2, LargestPrimeFactor.find(4096));
        assertEquals(2, LargestPrimeFactor.find((long) Math.pow(2, 32)));

        assertEquals(3, LargestPrimeFactor.find(9));
        assertEquals(3, LargestPrimeFactor.find(18));
        assertEquals(5, LargestPrimeFactor.find(25));

        assertEquals(11, LargestPrimeFactor.find(11));
        assertEquals(179424673, LargestPrimeFactor.find(179424673));
        assertEquals(29996224275833L, LargestPrimeFactor.find(29996224275833L));

        assertEquals(5, LargestPrimeFactor.find(10));
        assertEquals(29, LargestPrimeFactor.find(13195));
        assertEquals(6857,LargestPrimeFactor.find(600851475143L));

    }
}
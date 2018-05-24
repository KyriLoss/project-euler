package problem0006_sumSquareDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSquareDifferenceTest {

    @Test
    void testSumN() {
        assertEquals(5050, SumSquareDifference.sumN(100));
    }

    @Test
    void testSumN2() {
        assertEquals(338350, SumSquareDifference.sumN2(100));
    }

    @Test
    void testCalculate() {
        assertEquals(22, SumSquareDifference.calculate(3));
        assertEquals(2640, SumSquareDifference.calculate(10));
    }
}
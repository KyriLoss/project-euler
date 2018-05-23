package problem0001_35multiplesSumTest;

import org.junit.jupiter.api.Test;
import problem0001_35multiplesSum.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testCalculateSum() {
        assertEquals(23, Solution.calculateSum(10));
        assertEquals(2318, Solution.calculateSum(100));
    }
}
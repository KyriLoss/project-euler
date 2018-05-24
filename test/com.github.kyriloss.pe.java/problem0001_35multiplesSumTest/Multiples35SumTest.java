package problem0001_35multiplesSumTest;

import org.junit.jupiter.api.Test;
import problem0001_35multiplesSum.Multiples35Sum;

import static org.junit.jupiter.api.Assertions.*;

class Multiples35SumTest {

    @Test
    void testCalculate() {
        assertEquals(23, Multiples35Sum.calculate(10));
        assertEquals(2318, Multiples35Sum.calculate(100));
    }
}
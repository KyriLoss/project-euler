package problem0005_smallestMultiple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmallestMultipleTest {

    @Test
    void testGcd() {
        assertEquals(3, SmallestMultiple.gcd(6, 9));
        assertEquals(6, SmallestMultiple.gcd(24, 54));
        assertEquals(12, SmallestMultiple.gcd(48, 180));
    }

    @Test
    void testLcm() {
        assertEquals(15, SmallestMultiple.lcm(3, 5));
        assertEquals(20, SmallestMultiple.lcm(4, 10));
        assertEquals(24, SmallestMultiple.lcm(6, 8));
    }

    @Test
    void testFind() {
        assertEquals(6, SmallestMultiple.find(3));
        assertEquals(2520, SmallestMultiple.find(10));
    }
}
package problem0004_largestPalindromeProduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPalindromeProductTest {

    @Test
    void testFind() {
        assertEquals(101101, LargestPalindromeProduct.find(101110));
        assertEquals(793397, LargestPalindromeProduct.find(800000));
        assertEquals(906609, LargestPalindromeProduct.find(999999));

        assertEquals(696696, LargestPalindromeProduct.find(698896));
    }
}
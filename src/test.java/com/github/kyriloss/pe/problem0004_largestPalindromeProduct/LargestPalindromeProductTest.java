package com.github.kyriloss.pe.problem0004_largestPalindromeProduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPalindromeProductTest {

    @Test
    void testFindLargestPalindromeProduct() {
        assertEquals(101101, LargestPalindromeProduct.findLargestPalindromeProduct(101110));
        assertEquals(793397, LargestPalindromeProduct.findLargestPalindromeProduct(800000));
        assertEquals(906609, LargestPalindromeProduct.findLargestPalindromeProduct(999999));

        assertEquals(696696, LargestPalindromeProduct.findLargestPalindromeProduct(698896));
    }
}
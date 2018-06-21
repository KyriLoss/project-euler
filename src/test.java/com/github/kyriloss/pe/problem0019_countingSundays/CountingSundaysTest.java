package com.github.kyriloss.pe.problem0019_countingSundays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSundaysTest {

    @Test
    void testCount() {
        assertEquals(0, CountingSundays.count(new long[]{1900,1,1}, new long[]{1900,2,1}));
        assertEquals(1, CountingSundays.count(new long[]{1900,1,1}, new long[]{1900,4,1}));
        assertEquals(2, CountingSundays.count(new long[]{1900,1,1}, new long[]{1900,7,1}));

        assertEquals(18, CountingSundays.count(new long[]{1900,1,1}, new long[]{1910,1,1}));
        assertEquals(35, CountingSundays.count(new long[]{2000,1,1}, new long[]{2020,1,1}));
        assertEquals(171, CountingSundays.count(new long[]{1901,1,1}, new long[]{2000,12,31}));

        assertEquals(688, CountingSundays.count(new long[]{1901,1,1}, new long[]{2300,12,31}));
        assertEquals(688, CountingSundays.count(new long[]{2301,1,1}, new long[]{2700,12,31}));
        assertEquals(688, CountingSundays.count(new long[]{2701,1,1}, new long[]{3100,12,31}));

        assertEquals(4816, CountingSundays.count(new long[]{1901,1,1}, new long[]{4700,12,31}));
    }
}
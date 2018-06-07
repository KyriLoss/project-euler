package com.github.kyriloss.pe.problem0014_longestCollatzSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCollatzSequenceTest {

    @Test
    void testCollatzSeqLengths() {
        assertEquals(0, LongestCollatzSequence.collatzSeqLengths(1));
        assertEquals(19, LongestCollatzSequence.collatzSeqLengths(9));
        assertEquals(46, LongestCollatzSequence.collatzSeqLengths(123));
        assertEquals(99, LongestCollatzSequence.collatzSeqLengths(1982));
        assertEquals(524, LongestCollatzSequence.collatzSeqLengths(837799));
        assertEquals(596, LongestCollatzSequence.collatzSeqLengths(3732423));
    }

}
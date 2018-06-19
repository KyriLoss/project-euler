package com.github.kyriloss.pe.problem0017_numberToWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @Test
    void testConvertToWord() {
        assertEquals("Zero", NumberToWords.convertToWord(0));

        assertEquals("Three", NumberToWords.convertToWord(3));
        assertEquals("Seven", NumberToWords.convertToWord(7));
        assertEquals("Nine", NumberToWords.convertToWord(9));

        assertEquals("Ten", NumberToWords.convertToWord(10));
        assertEquals("Seventeen", NumberToWords.convertToWord(17));
        assertEquals("Nineteen", NumberToWords.convertToWord(19));

        assertEquals("Twenty Three", NumberToWords.convertToWord(23));
        assertEquals("Forty Seven", NumberToWords.convertToWord(47));
        assertEquals("Ninety Nine", NumberToWords.convertToWord(99));

        assertEquals("One Hundred Three", NumberToWords.convertToWord(103));
        assertEquals("One Thousand Three", NumberToWords.convertToWord(1003));
        assertEquals("Ten Thousand Three", NumberToWords.convertToWord(10003));

        assertEquals("One Trillion Two Hundred Thirty Four Billion Five Hundred Sixty " +
                        "Seven Million Eight Hundred Ninety Thousand Eight Hundred Seventy Six",
                NumberToWords.convertToWord(1234567890876L));
    }
}
package com.github.kyriloss.pe.problem0013_largeSum;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargeSumTest {

    @Test
    void testCalculateSum() {
        List<BigInteger> n = new ArrayList<>();
        n.add(new BigInteger("37107287533902102798797998220837590246510135740250"));
        n.add(new BigInteger("46376937677490009712648124896970078050417018260538"));
        n.add(new BigInteger("74324986199524741059474233309513058123726617309629"));
        n.add(new BigInteger("91942213363574161572522430563301811072406154908250"));
        n.add(new BigInteger("23067588207539346171171980310421047513778063246676"));

        for (int i = 0; i < 1000; i++) {
            String expected = "2728190129";
            String actual = LargeSum.getFirstNDigitsOfSum(LargeSum.calculateSum(n), 10);
            assertEquals(expected, actual);
        }
    }
}
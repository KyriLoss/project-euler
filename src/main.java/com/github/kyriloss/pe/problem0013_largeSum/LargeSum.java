package com.github.kyriloss.pe.problem0013_largeSum;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeSum {
    public static BigInteger calculateSum(List<BigInteger> n) {
        return n.stream().reduce(BigInteger.ZERO, BigInteger::add);
    }

    public static String getFirstNDigitsOfSum(BigInteger sum, int n) {
        return sum.toString().substring(0, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        List<BigInteger> n = new ArrayList<>();
        for(int a0 = 0; a0 < t; a0++) {
            n.add(in.nextBigInteger());
        }

        System.out.println(getFirstNDigitsOfSum(calculateSum(n), 10));
    }
}

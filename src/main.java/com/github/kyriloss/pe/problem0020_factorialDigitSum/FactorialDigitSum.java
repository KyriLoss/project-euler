package com.github.kyriloss.pe.problem0020_factorialDigitSum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FactorialDigitSum {
    public static BigInteger factorial(BigInteger n) {
        if (n == BigInteger.ZERO) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static int sumOfDigits(BigInteger n) {
        return Arrays.stream(n.toString().split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(sumOfDigits(factorial(BigInteger.valueOf(n))));
        }
    }
}

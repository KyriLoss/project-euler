package com.github.kyriloss.pe.problem0016_powerDigitSum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PowerDigitSum {
    public static int sumOfDigits(BigInteger n) {
        return Arrays.stream(n.toString().split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(sumOfDigits(BigInteger.valueOf(2).pow(n)));
        }
    }
}

package com.github.kyriloss.pe.problem0006_sumSquareDifference;

import java.util.Scanner;

public class SumSquareDifference {
    public static long sumN(long n) {
        return n * (n + 1) / 2;
    }

    public static long sumN2(long n) {
        return n * (n + 1) * (2*n + 1) / 6;
    }

    public static long calculateSumSquareDifference(long n) {
        long sN = sumN(n);
        long sN2 = sumN2(n);
        return sN * sN - sN2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(calculateSumSquareDifference(n));
        }
    }
}
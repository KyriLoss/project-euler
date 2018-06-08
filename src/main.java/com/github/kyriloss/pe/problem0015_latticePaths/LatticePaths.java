package com.github.kyriloss.pe.problem0015_latticePaths;

import java.math.BigInteger;
import java.util.Scanner;

public class LatticePaths {
    public static BigInteger factorial(int n) {
        return n == 1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static String numberOfPaths(int n, int m) {
        return factorial(n+m).divide(factorial(n).multiply(factorial(m))).mod(BigInteger
                .valueOf(1000000007)).toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int a0 = 0; a0 < t; a0++) {
            String[] d = in.nextLine().split(" ");
            System.out.println(numberOfPaths(Integer.parseInt(d[0]), Integer.parseInt(d[1])));
        }
    }
}

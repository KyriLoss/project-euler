package com.github.kyriloss.pe.problem0005_smallestMultiple;

import java.util.Scanner;

public class SmallestMultiple {
    public static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static long findSmallestMultiple(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = lcm(p, i);
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findSmallestMultiple(n));
        }
    }
}
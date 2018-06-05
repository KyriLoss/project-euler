package com.github.kyriloss.pe.problem0012_triangularNumber;

import java.util.Scanner;

public class TriangularNumber {
    public static int numberOfDivisors(int x) {
        if (x == 1) {
            return 1;
        }

        int counter = 1;
        for (int i = 2; i*i < x+1; i++) {
            if (x % i == 0) {
                counter++;
            }
        }

        int sqrt = (int) Math.sqrt(x);
        return sqrt*sqrt == x ? 2*counter-1 : 2*counter;
    }

    public static int findNumber(int n) {
        if (n == 1) {
            return 3;
        }
        else if (n == 2 || n == 3) {
            return 6;
        }

        int i = 1;
        int a = 2;
        int b = 2;
        while (a*b <= n) {
            if (i % 2 == 0) {
                b = numberOfDivisors(i+1);
            }
            else {
                a = numberOfDivisors((i+1)/2);
            }
            i++;
        }

        return i*(i-1)/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findNumber(n));
        }
    }
}
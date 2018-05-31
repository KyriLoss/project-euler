package com.github.kyriloss.pe.problem0009_specialPythagoreanTriplet;

import java.util.Scanner;

public class SpecialPythagoreanTriplet {
    public static long calculateProductOfPythagoreanTripletWithSumN(int n) {
        long p = -1;

        if (n % 2 == 0) {
            int a = 3, b, c;
            long abc;
            double tmp;
            while (a <= n / 3) {
                tmp = 0.5 * n * (n - 2 * a) / (n - a);
                if (tmp == (int) tmp) {
                    b = (int) tmp;
                    c = n - b - a;
                    abc = a*b*c;
                    p = abc > p ? abc : p;
                }
                a++;
            }
        }

        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(calculateProductOfPythagoreanTripletWithSumN(n));
        }
    }
}
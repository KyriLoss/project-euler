package com.github.kyriloss.pe.problem0010_sumOfPrimes;

import java.util.Scanner;

public class SumOfPrimes {
    public static int[] primesToN(int n) {
        if (n < 2) {
            return new int[]{0,0};
        }
        else if (n == 2) {
            return new int[]{0,0,2};
        }

        int[] primes = new int[n+1];
        primes[2] = 2;
        primes[3] = 3;

        for (int i = 2; i <= (n-1)/2; i++) {
            primes[2*i+1] = 2*i+1;
        }

        for (int i = 3; i*i < n+1; i+=2) {
            if (primes[i] != 0) {
                for (int j = i*i; j < n+1; j+=2*i) {
                    primes[j] = 0;
                }
            }
        }

        return primes;
    }

    public static long calculateSumOfPrimes(int[] primes, int n) {
        if (n < 2) {
            return 0;
        }
        else if (n == 2) {
            return 2;
        }

        long sum = 2;
        for (int i = 3; i < n+1; i+=2) {
            sum += primes[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        int maxN = 0;
        int[] arrayOfN = new int[t];
        for(int a0 = 0; a0 < t; a0++) {
            n = in.nextInt();
            if (n > maxN) {
                maxN = n;
            }
            arrayOfN[a0] = n;
        }

        int[] primes = primesToN(maxN);
        for (int i = 0; i < arrayOfN.length; i++) {
            System.out.println(calculateSumOfPrimes(primes, arrayOfN[i]));
        }

    }
}
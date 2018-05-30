package com.github.kyriloss.pe.problem0007_NthPrime;

import java.util.*;

public class NthPrime {
    public static int findNthPrime(int n) {
        if (n <= 6) {
            int[] tmp = new int[6];
            tmp[0] = 2;
            tmp[1] = 3;
            tmp[2] = 5;
            tmp[3] = 7;
            tmp[4] = 11;
            tmp[5] = 13;

            return tmp[n-1];
        }

        double lnN = Math.log(n);
        double lnLnN = Math.log(lnN);
        int maxN = (int) (n * (lnN + lnLnN));

        Integer[] tmp = new Integer[maxN];
        tmp[0] = null;
        tmp[1] = null;
        tmp[2] = 2;
        tmp[3] = 3;

        for (int i = 2; i <= maxN/2-1; i++) {
            tmp[2*i] = null;
            tmp[2*i+1] = 2*i+1;
        }

        for (int i = 3; i*i < maxN; i+=2) {
            for (int j = i; i*j < maxN; j+=2) {
                tmp[i*j] = null;
            }
        }

        List<Integer> primes = new ArrayList<>(Arrays.asList(tmp));
        primes.removeAll(Collections.singleton(null));

        return primes.get(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findNthPrime(n));
        }
    }
}
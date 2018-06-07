package com.github.kyriloss.pe.problem0014_longestCollatzSequence;

import java.util.Scanner;

public class LongestCollatzSequence {
    private final static int CAP = 5000000;
    private final static int[] cacheLengths = new int[CAP];
    private final static int[] cacheN = new int[CAP];

    public static int collatzSeqLengths(long n) {
        if (n == 1) {
            return 0;
        }

        if (n < CAP) {
            if (cacheLengths[(int) n] > 0) {
                return cacheLengths[(int) n];
            }
        }

        int nextN = (n & 1) == 0 ? collatzSeqLengths(n>>1) + 1 : collatzSeqLengths((3*n+1)>>1) + 2;

        if (n < CAP)
            cacheLengths[((int) n)] = nextN;

        return nextN;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int maxLength = 0;
        int nMaxLength = 0;
        for (int i = 2; i < CAP; i++) {
            cacheLengths[i] = collatzSeqLengths(i);

            if (cacheLengths[i] >= maxLength) {
                maxLength = cacheLengths[i];
                nMaxLength = i;
            }

            cacheN[i] = nMaxLength;

            if (i+1 < CAP) {
                cacheN[i] = nMaxLength;
            }
        }

        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(cacheN[n]);
        }
    }
}
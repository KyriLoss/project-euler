package com.github.kyriloss.pe.problem0004_largestPalindromeProduct;

import java.util.Scanner;

public class LargestPalindromeProduct {
    private final static int MIN_N = 101101;

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static int findLargestPalindromeProduct(int n) {
        for (int i = n - 1; i >= MIN_N; i--) {
            for (int j = 121; j < 1000; j++) {
                if (i % 11 == 0) {
                    if (isPalindrome(i) && j * j < i && i % j == 0 && i / j < 1000) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findLargestPalindromeProduct(n));
        }
    }
}

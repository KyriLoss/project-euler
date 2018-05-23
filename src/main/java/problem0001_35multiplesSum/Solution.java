package problem0001_35multiplesSum;

import java.util.Scanner;

public class Solution {
    public static long sumToN(long n) {
        return n * (n + 1) / 2;
    }

    public static long calculateSum(long n) {
        long n3 = (n - 1) / 3;
        long n5 = (n - 1) / 5;
        long n15 = (n - 1) / 15;

        return 3 * sumToN(n3) + 5 * sumToN(n5) - 15 * sumToN(n15);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        long n;
        for(int i = 0; i < t; i++) {
            n = in.nextLong();
            System.out.println(calculateSum(n));
        }
    }
}
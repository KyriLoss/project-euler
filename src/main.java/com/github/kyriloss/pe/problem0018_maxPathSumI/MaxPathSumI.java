package com.github.kyriloss.pe.problem0018_maxPathSumI;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPathSumI {
    public static int getMaxPathSum(int[][] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                a[i-1][j] += Math.max(a[i][j], a[i][j+1]);
            }
        }
        return a[0][0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] res = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            res[a0] = getMaxPathSum(a);
        }

        Arrays.stream(res).limit(t-1).forEach(System.out::println);
        System.out.print(res[t-1]);
    }
}

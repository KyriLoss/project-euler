package com.github.kyriloss.pe.problem0011_largestProductInGrid;

import java.util.Scanner;

public class LargestProductInGrid {
    public static long calculateProduct(int[][] grid) {
        int[][] greaterGrid = new int[26][26];
        for (int i = 3; i < 23; i++) {
            for (int j = 3; j < 23; j++) {
                greaterGrid[i][j] = grid[i-3][j-3];
            }
        }

        long product = 0;
        int tmp;
        for (int i = 3; i < 23; i++) {
            for (int j = 3; j < 23; j++) {
                tmp = greaterGrid[i][j] * greaterGrid[i + 1][j] * greaterGrid[i + 2][j] * greaterGrid[i + 3][j];
                product = Math.max(tmp, product);

                tmp = greaterGrid[i][j] * greaterGrid[i][j + 1] * greaterGrid[i][j + 2] * greaterGrid[i][j + 3];
                product = Math.max(tmp, product);

                tmp = greaterGrid[i][j] * greaterGrid[i + 1][j + 1] * greaterGrid[i + 2][j + 2] * greaterGrid[i + 3][j + 3];
                product = Math.max(tmp, product);
            }
        }

        for (int i = 22; i > 2; i--) {
            for (int j = 3; j < 23; j++) {
                tmp = greaterGrid[i][j]*greaterGrid[i-1][j+1]*greaterGrid[i-2][j+2]*greaterGrid[i-3][j+3];
                product = Math.max(tmp, product);
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(calculateProduct(grid));
    }
}
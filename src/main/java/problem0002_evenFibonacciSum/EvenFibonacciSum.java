package problem0002_evenFibonacciSum;

import java.util.Scanner;

public class EvenFibonacciSum {
    public static long calculateSum(long n) {
        if (n < 2) {
            return 0;
        }
        else {
            long x = 0, y = 2, z = 8;
            long sum = x + y;
            while (z <= n) {
                sum += z;
                x = y;
                y = z;
                z = x + 4*y;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(calculateSum(n));
        }
    }
}

package problem0003_largestPrimeFactor;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static long find(long n) {
        while (n % 2 == 0) {
            n /= 2;
        }

        if (n == 1) {
            return 2;
        }

        long i = 3;
        while (n > 1) {
            while (n % i == 0) {
                n /= i;
            }
            if (i*i > n) {
                break;
            }
            i +=2;
        }

        return n > 1 ? n : i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(find(n));
        }
    }
}

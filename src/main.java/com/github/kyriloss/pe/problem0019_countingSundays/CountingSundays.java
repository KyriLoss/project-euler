package com.github.kyriloss.pe.problem0019_countingSundays;

import java.util.Scanner;

public class CountingSundays {
    private final static int DAY_OF_MONTH = 1;

    public static int count(long[] date1, long[] date2) {
        if (date2[0] < date1[0] || (date2[0] == date1[0] && date2[1] < date1[1])) {
            long tmp = date1[0];
            date1[0] = date2[0];
            date2[0] = tmp;

            tmp = date1[1];
            date1[1] = date2[1];
            date2[1] = tmp;
        }

        if (date1[2] > 1) {
            date1[1]++;
        }

        int counter = 0;

        if (date1[0] == date2[0]) {
            for (int m = (int) date1[1]; m <= date2[1]; m++) {
                if (findWhatDay(date1[0], m, DAY_OF_MONTH) == 0) {
                    counter++;
                }
            }
            return counter;
        }

        int years = (int) (date2[0] - date1[0]);
        if (years > 400) {
            counter = (years / 400) * 688;
            date1[0] += years % 400 != 0 ? years - years % 400 : date2[0];
        }

        for (int m = (int) date1[1]; m <= 12; m++) {
            if (findWhatDay(date1[0], m, DAY_OF_MONTH) == 0) {
                counter++;
            }
        }

        for (long y = date1[0]+1; y < date2[0]; y++) {
            for (int m = 1; m <= 12; m++) {
                if (findWhatDay(y, m, DAY_OF_MONTH) == 0) {
                    counter++;
                }
            }
        }

        for (int m = 1; m <= date2[1]; m++) {
            if (findWhatDay(date2[0], m, DAY_OF_MONTH) == 0) {
                counter++;
            }
        }

        return counter;
    }

    private static int findWhatDay(long year, int month, int day) {
        int m = ((month + 9) % 12) + 1;

        year -= (14 - month) / 12;
        long y = year / 100;
        long j = year % 100;

        return (int) ((day + (13*m - 1)/5 + j + j/4 - 2*y + y/4) % 7);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            long y1 = in.nextLong();
            int m1 = in.nextInt();
            int d1 = in.nextInt();
            long[] date1 = new long[]{y1, m1, d1};

            long y2 = in.nextLong();
            int m2 = in.nextInt();
            int d2 = in.nextInt();
            long[] date2 = new long[]{y2, m2, d2};

            System.out.println(count(date1, date2));
        }
    }
}
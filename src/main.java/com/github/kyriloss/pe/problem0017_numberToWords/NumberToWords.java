package com.github.kyriloss.pe.problem0017_numberToWords;

import java.util.Scanner;

public class NumberToWords {
    private final static String[] lexicon = new String[]{"Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
            "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static String s = "";

    public static String howMany(int n) {
        if (n / 100 > 0) {
            s += lexicon[n/100] + " Hundred ";
        }

        if (n % 100 > 0 && n % 100 < 20) {
            s += lexicon[n%100] + " ";
        }
        else if ((n/10) % 10 > 0) {
            s += lexicon[(n/10) % 10 + 18] + " ";
            if (n % 10 > 0) {
                s += lexicon[n%10] + " ";
            }
        }

        return s.trim();
    }

    public static String convertToWord(long n) {
        if (n == 0) {
            return "Zero";
        }

        s = "";

        int tln = (int) (n / 1000000000000L);
        int bln = (int) ((n / 1000000000) % 1000);
        int mln = (int) (n / 1000000) % 1000;
        int tsn = (int) ((n / 1000) % 1000);
        int hrd = (int) (n % 1000);

        if (tln > 0) {
            howMany(tln);
            s += "Trillion ";
        }
        if (bln > 0) {
            howMany(bln);
            s += "Billion ";
        }
        if (mln > 0) {
            howMany(mln);
            s += "Million ";
        }
        if (tsn > 0) {
            howMany(tsn);
            s += "Thousand ";
        }
        if (hrd > 0) {
            howMany(hrd);
        }

        return s.trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(convertToWord(n));
        }
    }
}

package com.github.kyriloss.pe.problem0008_largestKProductInN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestKProductInN {
    public static String calculateLargestKProductInN(int n, int k, String num) {
        List<Integer> digits = num
                .chars()
                .map(c -> c -'0').boxed()
                .collect(Collectors.toList());

        List<Integer> products = new ArrayList<>();
        IntStream.range(0, n - k + 1)
                .mapToObj(i -> digits.subList(i, Math.min(k + i, n)))
                .forEach(j -> products.add(j.stream().reduce(1, (a,b) -> a*b)));

        Collections.sort(products);

        return products.get(products.size()-1).toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            System.out.println(calculateLargestKProductInN(n, k, num));
        }
    }
}
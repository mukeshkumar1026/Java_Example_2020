package com.array.example;

import java.util.Arrays;

public class TwoSum {

    public  static  int[] twoSumArray(int[] n, int sum) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] == (sum - n[i])) {
                    return new int[]{i, j};
                }
            }
        }
        throw new  IllegalArgumentException("No pair is found");
    }
    public static void main(String[] args) {
        int[] n={2,7,11,15};
        int sum=18;
        System.out.println("Sum of array" + Arrays.toString(twoSumArray(n,sum)));
    }
}

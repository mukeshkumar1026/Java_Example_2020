package com.restAPI.example;

public class MissingArrayElements {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 6, 9, 8,1,7};
        int n = a.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
        }
        System.out.println("Missing Number :" +sum);
    }
}
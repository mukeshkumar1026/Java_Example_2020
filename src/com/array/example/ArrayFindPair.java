package com.array.example;

public class ArrayFindPair {

    public static void main(String[] args) {
        int[] a1={1, 2, 9, 3, 5, 4, 7, 8, 10};
        int sum=9;
        getPair(a1, sum);
    }
    public static void getPair(int[] a1, int sum){
        int count=0;
        for (int i=0;i<a1.length;i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] + a1[j] == sum) {
                    count++;
                }
            }
        }
                System.out.println("Pair of the number :" +count);
            }
}

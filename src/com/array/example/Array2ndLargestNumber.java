package com.array.example;

public class Array2ndLargestNumber {
    public static void main(String[] args) {
        int[] a1={9, 6, 7, 3, 5, 3, 1, 8, 20, 30};
        int k=2;
        int temp;
        for (int i=0;i<a1.length;i++){
            for (int j=i+1;j<a1.length;j++) {
                if (a1[i] < a1[j]) {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println("2nd Largest Number is : " +a1[i]);

                }
            }
        }
    }
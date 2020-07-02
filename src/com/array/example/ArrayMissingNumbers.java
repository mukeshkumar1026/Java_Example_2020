package com.array.example;

public class ArrayMissingNumbers {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,6,7};

    int totalNumber=7;
    int sumResult=totalNumber*((totalNumber+1)/2);

    int sum=0;
    for(int i:arr) {
        sum = sum + i;
    }

        System.out.println(sumResult-sum);
        System.out.println("\n");
    }
    }

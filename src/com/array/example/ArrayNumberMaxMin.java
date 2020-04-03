package com.array.example;

public class ArrayNumberMaxMin {

    public static void main(String[] args) {
        int[] a1={9, 3, 5, 7, 10};
        int min=a1[0];
//        int max=a1[0];
        for(int i=1;i<a1.length;i++) {
//            if (max < a1[i]) {
//                max=a1[i];
//            }
            if (min>a1[i]){
                min=a1[i];
            }
        }
//            System.out.println("Maximum number is :" +max);
        System.out.println("Minimum Number is : " +min);
    }
}

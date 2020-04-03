package com.array.example;

import java.util.HashSet;

public class Array2CommanEle {

    public static void main(String[] args) {

        int[] arr1 ={4,5,3,2,6,8};
        int[] arr2={2,3,4,6,8,9};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
//                    hs.add(arr1[i]);
//                    break;
                }
            }
//            for (int no:hs){
                System.out.println(arr1[i]+ " ");
//            }
       }
    }

}

package com.array.example;

import java.util.HashSet;

public class DebuggArrayExample {

    public static void main(String[] args) {

        int[] a1={1,0,1,0,0,1,0,0,0,1,0,0,0,0};
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int i=0;i<a1.length;i++){
            hashSet.add(a1[i]);
        }
        for (int set:hashSet){
            int count=0;
            for (int j=0;j< a1.length;j++){
                if (set==a1[j])
                {
                    count++;
                }
            }
            System.out.println(set+ " occurr: " +count+ " times");
        }
    }
}
package com.example.test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class ReverseArrayNumber {

    static void test(int a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args) {
        int[] a1={10, 20, 30, 40, 50};
        ReverseArrayNumber obj=new ReverseArrayNumber();
        obj.test(a1);
    }
}

package com.selenium.example.task;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        //++
        //--
        int i=1;
        int j=i++;//post increment
        System.out.println(i);
        System.out.println(j);
        int a=1;
        int b=++a;//pre increment
        System.out.println(a);
        System.out.println(b);

        int m=2;
        int n=m--;
        System.out.println(m);
        System.out.println(n);
        int p=2;
        int q=--p;
        System.out.println(p);
        System.out.println(q);
    }
}

package com.example.test;

public class ReverseNumber {

    public static void main(String[] args) {

        int n=897465,rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev
        );
    }
}

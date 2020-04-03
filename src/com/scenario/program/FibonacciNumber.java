package com.scenario.program;

import java.util.Scanner;

public class FibonacciNumber {

    static int test(int n) {
        if (n <= 1)
            return n;
            return test(n - 1) + test(n - 2);
        }
        public static void main(String[]args){
        int a;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the user number");
            a = sc.nextInt();
            System.out.println(test(a));
        }
}
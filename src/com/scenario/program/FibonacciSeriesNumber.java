package com.scenario.program;

public class FibonacciSeriesNumber {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.println("Sum of c is :" + c);
            a = b;
            b = c;
        }
    }
}

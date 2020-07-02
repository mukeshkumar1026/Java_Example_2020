package com.restAPI.example;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n, result = 1, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Floyd triangle is: ");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(result + " ");
                result++;
            }
            System.out.println();
        }
    }
}

package com.restAPI.example;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        i = sc.nextInt();
//        if (i % 2 == 0) {
            if((i/2)*2==i){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

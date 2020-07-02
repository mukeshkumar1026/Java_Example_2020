package com.example.java.program;

import java.util.Scanner;

public class NumberEneterPattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("How Many rows you want for this pattern?");
        int n=sc.nextInt();
        System.out.println("===================");
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

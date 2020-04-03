package com.selenium.example.task;

public class LoopsConcepts {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        int i=1;
        while(i<=10){
            System.out.println(i);
           i=i+1;
        }

        System.out.println("***************");
        //j++ means j+1

        for(int j=1;j<=10;j++){
            System.out.println(j);
        }
        System.out.println("********************");
        for (int k=10;k>=-10;k--){
            System.out.println(k);
        }
    }
}

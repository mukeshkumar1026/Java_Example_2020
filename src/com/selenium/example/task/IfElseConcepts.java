package com.selenium.example.task;

public class IfElseConcepts {
    public static void main(String[] args) {

        int a=30;
        int b=20;
        if(b>a) {
            System.out.println("b is greater then a");
        }
        else {
            System.out.println("a is greater then b");
        }
        //comparision
        //<> == <= >= !=
        int c=40;
        int d=50;
        if(c==d){
            System.out.println("c and d are equals");
        }
        else {
            System.out.println("c and d are not equals");
        }
        int a1=500;
       int b1=700;
       int c1=300;
       if(a1>b1 & a1>c1) {
           System.out.println("a1 is greater");
       }
       else if(b1>c1) {
           System.out.println("b1 is greater");
       }
       else {
           System.out.println("c1 is greater");


       }
    }
}

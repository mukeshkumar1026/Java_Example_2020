package com.scenario.program;

public class FactorialNumber {

    static int test(int n){

        if(n==0){
            return 1;
        }
        return n*test(n-1);

    }

    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial Number is : " +num+ " Equal to : " +test(5));
    }
}

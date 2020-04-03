package com.selenium.example.task;

import com.example.test.Hello;

public class StringConcatenation {

    public static void main(String[] args) {

        int a=100;
        int b=200;
        double c1=12.33;
        double d1=10.33;
        String x= "Hello";
        String y="World";
        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.println((x+y)+a+b);
        System.out.println(a+b+(x+y));
        System.out.println(a+b+x+y+a+x+b+y);
        System.out.println(a+b+x+y+a+b);
        System.out.println(c1+d1);
        System.out.println(c1+d1+x+y);
        System.out.println("HelloWorld");
        System.out.println(a);
        System.out.println("The value of a is :" +a);
        System.out.println("The value of b is :" +b);
        System.out.println("This is a value a and b is :" +(a+b));
        System.out.print("Hello World");
        System.out.println("HelloWorld");

    }
}

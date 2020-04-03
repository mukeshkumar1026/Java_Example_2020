package com.OOPsConceptPart1;

public class FunctionInJava {
    //function and method same
    //main method starting point of execution
    public static void main(String[] args) {
        FunctionInJava obj=new FunctionInJava();
    //one object will be created , obj is references variable, referring to this object
//after creating the object,the copy of the all non static methods will be give the to this object
        obj.test();
        int l=obj.pqr();
        System.out.println(l);
        String s1=obj.qa();
        System.out.println(s1);
        int div=obj.division(30,10);
        System.out.println(div);
// main method void, never return the value
    }

    //non static method
    //void---does not return any value
    //return type of the test method test
    public void test(){//no input no output
        System.out.println("test method");

    }
    //return type of method int
    public int pqr(){
        System.out.println("PQR");
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public String qa(){//no input some output
        System.out.println("qa method");
        String s="Selenium";
        return s;
    }
    //x and y input parameter or input arguments
    public int division(int x,int y){
        System.out.println("division methods");
        int d=x/y;
        return d;

    }
}

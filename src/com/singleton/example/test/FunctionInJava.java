package com.singleton.example.test;

public class FunctionInJava {

    public static void main(String[] args) {
//create the object of class
        //cna not create function inside function
        //function are independent to each other
        //function are parallel. to each other


        FunctionInJava obj=new FunctionInJava();
        obj.test();
        String s1=obj.pqr();
        System.out.println(s1);
        int d2=obj.div(30,10);
        System.out.println(d2);
      int d3=  obj.div(50,5);
      System.out.println(d3);
        obj.sendMail(1,"ABC");
        int d=obj.sum();
        System.out.println(d);

    }
//no input no output

    //void means does not return any value
    public void test(){
        System.out.println("test method");

    }
    public void test(int i){
        System.out.println("test method");
//method overloading---when the same class,function having same name but different parameter

    }

    public void test(String a, String b){
        System.out.println("test method");

    }
    public void test(int a,int b){
        System.out.println("test method");

    }
    //no input some output
    //return type function integer
    public int sum(){

        System.out.println("sum method");
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

    public String pqr(){

        System.out.println("PQR method");

        String s="Selenium";
        return s;
    }

    //some input and some output

    public int div(int x,int y){

        System.out.println("div method");
int z=x/y;
return z;

    }


    public String sendMail(int p, String q){

        System.out.println("sendmail method");
        String h=q+p;
        return h;
    }
}

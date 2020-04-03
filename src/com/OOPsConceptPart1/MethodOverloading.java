package com.OOPsConceptPart1;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();

        obj.sum();
        obj.sum(10);
        obj.sum(10,5);


    }

    public static void main(int i) {

    }

    public static void main(double d) {

    }

    public static void main(int q, int p) {

    }
    //main method overload yes
    //you can not create method inside a method
    //method overloading---->when the method name is same with different arguments or input parameter within the same class
    //duplicate same method name or same arguments not allowed
    public void sum(){
        System.out.println("Test");
    }
    public void sum(int i){
        System.out.println(i);
    System.out.println("sum method---1 input parameter");
    }
    public void sum(int k, int l){
        System.out.println(k+l);
        System.out.println("Sum---------2 input parameter");
    }
}

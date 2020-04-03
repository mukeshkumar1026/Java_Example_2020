package com.OOPsConceptPart1;

public class B extends A {

    public B(){
        super();

        System.out.println("child class cons");
    }

    public B(int i,int j){
        super(i,j);
    }

    public static void main(String[] args) {

B obj=new B();

B obj2=new B(10,20);
    }
}

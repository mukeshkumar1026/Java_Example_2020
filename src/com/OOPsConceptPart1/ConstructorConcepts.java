package com.OOPsConceptPart1;

public class ConstructorConcepts {


    public ConstructorConcepts(){

        System.out.println("this is default constructor");
    }

    public ConstructorConcepts(int i){

        System.out.println("single param constructor");
        System.out.println("the value of i"+i);
    }
//constructor overload
    public ConstructorConcepts(int i,int j){

        System.out.println("single param constructor");
        System.out.println("the value of i"+i);
        System.out.println("the value of j"+j);
    }

    public static void main(String[] args) {

        ConstructorConcepts con1=new ConstructorConcepts();
        ConstructorConcepts con=new ConstructorConcepts(10,20);
    }
}

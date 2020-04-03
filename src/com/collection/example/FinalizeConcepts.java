package com.collection.example;

public class FinalizeConcepts {

    public void finalize(){

        System.out.println("finalize method");
    }

    public static void main(String[] args) {
        FinalizeConcepts f1=new FinalizeConcepts();
        FinalizeConcepts f2=new FinalizeConcepts();

        f1=null;
        f2=null;
        System.gc();
    }
}

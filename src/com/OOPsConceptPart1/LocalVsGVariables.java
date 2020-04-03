package com.OOPsConceptPart1;

public class LocalVsGVariables {

    //Global and class variable

    String name="Tom";
    int age=25;

    public static void main(String[] args) {
        LocalVsGVariables obj=new LocalVsGVariables();
        int i=10;//local variable with main method
        System.out.println(i);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
    public void sum(){

        int i=10;//local variable with sum method
        int j=20;
        int age=25;
    }

}

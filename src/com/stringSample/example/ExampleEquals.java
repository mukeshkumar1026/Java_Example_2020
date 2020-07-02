package com.stringSample.example;

public class ExampleEquals {
    public static void main(String[] args) {
        String s1=new String("Bangalore");//run time so create same in SCP
//        String s2=new String("Bangalore");// heap create 2 times obj ref and SCP only one obj ref create
//        String s1="Example";//run time new not used so print only SCP ==
        String s2="Bangalore";//heap not create any obj ref and SCP create only one time

        if(s1==s2){
            System.out.println("reference string constant pool same so only one object reference ");
        }
        else {
            System.out.println("and Heap different reference so create one more reference ");
        }
//        if(s1.equals(s2)){
//            System.out.println("test");
//        }
//        else{
//            System.out.println("example");
//        }
    }
}

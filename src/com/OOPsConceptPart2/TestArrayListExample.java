package com.OOPsConceptPart2;

import java.util.ArrayList;

public class TestArrayListExample {

    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(100);//0 index
        ar.add(200);//1
        ar.add(300);//2
        System.out.println(ar.size());

        ar.add(400);//3
        ar.add(500);//4
        System.out.println(ar.size());

        ar.add("Hello");//5
        ar.add(12.33);//6
        ar.add('A');//7
        ar.add(600);
        System.out.println(ar.size());
        ar.remove(6);


        System.out.println(ar.get(4));
        //System.out.println(ar.get(9));//IndexOutOfBoundsException

        //print all the values of array list

        for (int i=0;i<ar.size();i++){

            System.out.println(ar.get(i));
        }

        ArrayList<Integer> ar1=new ArrayList<Integer>();
    ar1.add(100);
    ///ar1.add("Tom"); string not allowed because only accept integer

        ArrayList<String> ar2=new ArrayList<String>();
        ar2.add("tom");


    }
}

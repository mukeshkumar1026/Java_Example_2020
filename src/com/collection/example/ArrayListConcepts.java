package com.collection.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {


    public static void main(String[] args) {

        int a[]=new int[3];//static array---fixed in size

        //dynamic array---arraylist
        //can contain duplicate value/elements
        //maintains insertion order
        //Synchronization
        //allow random access to fetch the element because it store the basic value of index

        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        System.out.println(ar.size());//size of arraylist

        ar.add(400);
        ar.add(500);
        ar.add(12.33);
        ar.add("test");
        ar.add('A');
        ar.add(true);
        System.out.println(ar.size());
        System.out.println(ar.get(4));//get value from index

        //print all value of arraylist

        //for loop
        //iterator

        for (int i=0;i<ar.size();i++){

            System.out.println(ar.get(i));

        }

        //non generic vs generic

        ArrayList<Integer> ar1=new ArrayList<Integer>();

        ar1.add(800);
        ar1.add(100);
        //ar1.add("Selenium"); generic integer type

        ArrayList<String> ar2=new ArrayList<String>();

        ar2.add("test");

        ar2.add("Selenium");

        //ArrayList<E> ar3=new ArrayList<E>();
//employee class object create

        Employee emp=new Employee("naveen",27,"IT");
        Employee emp1=new Employee("abc",23,"QA");


        //create arraylist

        ArrayList<Employee> ar4=new ArrayList<Employee>();

        ar4.add(emp);
        ar4.add(emp1);

        //iterator to traverse the value

        Iterator<Employee> it=ar4.iterator();

        while (it.hasNext()){

            Employee emp111=it.next();

            System.out.println(emp111.name);
            System.out.println(emp111.age);
            System.out.println(emp111.dept);
        }

        //addAll method

        ArrayList ar5=new ArrayList();
        ar5.add("test");
        ar5.add("selenium");
        ar.add("hi");

        ArrayList ar6=new ArrayList();

        ar6.add("java");
        ar6.add("test");
        ar6.add("text");
ar5.addAll(ar6);

for (int i=0;i<ar5.size();i++){

    System.out.println(ar5.get(i));


}

ar5.removeAll(ar6);
        for (int i=0;i<ar5.size();i++){

            System.out.println(ar5.get(i));

        }

        ArrayList ar7=new ArrayList();
        ar7.add("test");
        ar7.add("selenium");
        ar7.add("hi");

        ArrayList ar8=new ArrayList();

        ar8.add("java");
        ar8.add("test");
        ar8.add("text");

        System.out.println("****************");
        ar7.retainAll(ar8);
        for (int i=0;i<ar7.size();i++){

            System.out.println(ar7.get(i));

        }











    }
}

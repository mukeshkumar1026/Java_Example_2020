package com.OOPsConceptPart2;

import java.util.Hashtable;

public class ExampleHashT {
    public static void main(String[] args) {

        Hashtable h=new Hashtable();

        h.put("A", "Test");
        h.put("B", "Hello");
        h.put("C", "World");
        System.out.println(h.size());

        h.put(1,100);
        h.put(2,200);
        System.out.println(h.size());

        System.out.println(h.get(2));
        System.out.println(h.get("C"));
        h.put(1,"tom");
        System.out.println(h.get(1));

        Hashtable<Integer, String> h1=new Hashtable<Integer, String>();

        h1.put(1,"ABC");
       // h1.put(1,"tom");


    }
}
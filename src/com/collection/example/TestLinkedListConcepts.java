package com.collection.example;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedListConcepts {
    public static void main(String[] args) {
 LinkedList<String> ll=new LinkedList<String>();
 ll.add("test");
 ll.add("QTP");
 ll.add("Selenium");
 ll.add("RFT");
 ll.add("RPA");

//print
        System.out.println("content of list :"+ll);

        ll.addFirst("Naveen");
        ll.addLast("Automation");
 System.out.println("contaent of linkedlist :"+ll);
//get

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));

        //set

        ll.set(0, "tom");

        System.out.println(ll.get(0));

        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of list "+ll);

        ll.remove(2);

        System.out.println("content list "+ll);

//by using for loop
        //advance for loop
        //while loop
        //iterator

        for (int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        for (String str:ll){
            System.out.println(str);
        }

        Iterator<String> it=ll.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
int num=0;
        while (ll.size()>num){

            System.out.println(ll.get(num));
            num++;
        }


    }
}

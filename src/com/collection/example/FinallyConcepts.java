package com.collection.example;

import javax.sql.rowset.CachedRowSet;

public class FinallyConcepts {

    public static void main(String[] args) {
test1();
test2();
div();
    }
        public static void test1 () {

            try {

                System.out.println("inside test one method");

                throw new RuntimeException("test1");
            } catch (Exception e){
                System.out.println("inside catch block");

            }
            finally {
                System.out.println("inside finally block");
            }
        }

        public static void test2(){

        try {
            System.out.println("inside test2");
        }finally {
            System.out.println("inside test2 finally");


        }
        }

        public static void div(){
        int i=10;
        try {
            System.out.println("inside dive try block");
        int k=i/0;
        }catch (NullPointerException e){
            System.out.println("inside catch block div");
            System.out.println("div by zero error");
        }
        finally {
            System.out.println("div");
        }
        }
    }

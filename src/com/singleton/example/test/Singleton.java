package com.singleton.example.test;

public class Singleton {

    //In oop singleton class that can have only one object or instance class at a time
    //make sure the constructor private
    //static method return type object of this singleton class lazy initialization

    //normal class we call constructor where as singlton class we use getInstance() method for instances
    //lazy initialization create
    private static Singleton singleton_referance=null;
    public String str;


    private Singleton(){
        str="Hey i am using singleton class string";
    }

    public static Singleton getInstance() {
        if (singleton_referance == null)
            singleton_referance = new Singleton();
        return singleton_referance;
    }
    public static void main(String[] args) {
    Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        Singleton z=Singleton.getInstance();
        x.str=(x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str=(z.str).toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }

    }

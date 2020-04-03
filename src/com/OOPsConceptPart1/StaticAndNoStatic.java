package com.OOPsConceptPart1;

public class StaticAndNoStatic {

    String name="Tom";//no static method globle
    static int age=25;//static method

    public static void main(String[] args) {

        //call static method
        //1. call direct
        sum();
        //2. call by classname
        StaticAndNoStatic.sum();
        System.out.println(age);
        System.out.println(StaticAndNoStatic.age);

        StaticAndNoStatic obj=new StaticAndNoStatic();
        obj.senMail();
        System.out.println(obj.name);

        obj.sum();



    }
    public void senMail(){
        System.out.println("sendmail method");

    }
    public static void sum(){
        System.out.println("sum method");
    }
}

package com.OOPsConceptPart1;

public class ConstructorWithThisKey {
String name;
int age;

    public ConstructorWithThisKey(String name,int age){

        this.name=name;
        this.age=age;
System.out.println(name);
System.out.println(age);

    }

    public static void main(String[] args) {

        ConstructorWithThisKey obj=new ConstructorWithThisKey("tom",25);



    }
}

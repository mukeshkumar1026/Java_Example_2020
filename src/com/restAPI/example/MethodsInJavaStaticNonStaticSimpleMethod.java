package com.restAPI.example;

public class MethodsInJavaStaticNonStaticSimpleMethod {

    MethodsInJavaStaticNonStaticSimpleMethod() {
        System.out.println("Constructor Methods");
    }
    public static void staticMethod() {
        System.out.println("Static Method");
    }
    public void nonStaticMethod() {
        System.out.println("Non static Methods");
    }
    public static void main(String[] args) {
        MethodsInJavaStaticNonStaticSimpleMethod obj = new MethodsInJavaStaticNonStaticSimpleMethod();
        staticMethod();
        obj.nonStaticMethod();
        System.out.println("Main Methods");
    }
}

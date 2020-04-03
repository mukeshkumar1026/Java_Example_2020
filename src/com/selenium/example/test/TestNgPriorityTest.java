package com.selenium.example.test;

import org.testng.annotations.Test;

public class TestNgPriorityTest {

    @Test(priority=0)
    public void test1(){
        System.out.println("test1 method");
    }
    @Test(priority=1)
    public void test2(){
        System.out.println("test2 method");
    }
//    @Test(priority=2)
//    public void test3(){
//        System.out.println("test3");
//    }
}

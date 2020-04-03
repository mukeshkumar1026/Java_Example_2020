package com.selenium.example.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

    WebDriver driver;

    @BeforeMethod
    public void Start(){

        DriverInit instanceDriver=DriverInit.getInstance();
        driver=instanceDriver.openBrowser();


    }

    @Test
    public void testMethod(){

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){

        driver.quit();
    }
}

package com.selenium.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllScenarionTestCaseExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String baseURL="https://www.spicejet.com/";
//        String baseURL="https://learn.letskodeit.com/p/practice";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//        driver.findElement(By.id("header-sign-up-btn")).click();
//        driver.findElement(By.id("user_name")).sendKeys("Mukesh Kumar");
//        driver.findElement(By.id("user_email")).sendKeys("mukesh_kumar1026@hotmail.com");
//        driver.findElement(By.id("user_password")).sendKeys("Test@2020");
//        driver.findElement(By.id("user_password_confirmation")).sendKeys("Test@2020");
//        WebElement checkbox=driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
//        checkbox.click();
//        WebElement checkBox1=driver.findElement(By.id("user_agreed_to_terms"));
//        checkBox1.click();
//        driver.findElement(By.name("commit")).click();

        //Radio Button
//        driver.findElement(By.id("bmwradio")).click();

    }
}

package com.selenium.example.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String baseURL="http://demo.guru99.com/test/delete_customer.php";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.name("cusid")).sendKeys("276345");
        driver.findElement(By.name("submit")).click();
        Alert alert=driver.switchTo().alert();
        String message=driver.switchTo().alert().getText();
        System.out.println(message);
        Thread.sleep(5000);
        alert.accept();
        String message1=driver.switchTo().alert().getText();
        System.out.println(message1);
        Thread.sleep(3000);
       alert.accept();
            }
        }

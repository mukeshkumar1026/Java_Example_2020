package com.selenium.example.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class FlipkartScenarioExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String bashURL="https://www.amazon.in/";
        driver.get(bashURL);
        driver.manage().window().maximize();

//        String MainWindow=driver.getWindowHandle();
//        Set<String> s1=driver.getWindowHandles();
//        Iterator<String> i1=s1.iterator();
//        while (i1.hasNext()){
//            String ChildWindow=i1.next();
//            if(!MainWindow.equalsIgnoreCase(ChildWindow)){
//                driver.switchTo().window(ChildWindow);
//                driver.findElement(By.id("text")).sendKeys("mukeshnmit@gmail.com");
//                driver.findElement(By.id("password")).sendKeys("Raj@1990");
//                driver.findElement(By.id("Login")).click();
//                driver.close();
//            }
//            driver.switchTo().window(MainWindow);

        }

    }
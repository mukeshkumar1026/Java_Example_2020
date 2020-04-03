package com.selenium.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestScenario {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.amazon.com/";
        driver.get(baseURL);

        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.findElement(By.id("")).click();

    }
}

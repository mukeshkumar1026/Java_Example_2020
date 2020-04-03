package com.selenium.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    String baseURL="https://www.google.com/";
    driver.get(baseURL);
    //driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());


    }
}

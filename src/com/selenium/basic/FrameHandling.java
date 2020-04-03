package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String baseURL="https://ui.freecrm.com/";
        driver.get(baseURL);
       //span driver.findElement(By.xpath("//input[@type='Log In']")).click();


        driver.findElement(By.name("email")).sendKeys("mukesh_kumar1026@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("Mukesh@1026");
        driver.findElement(By.className("ui fluid large blue submit button")).click();
    }
}

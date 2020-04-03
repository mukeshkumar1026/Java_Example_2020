package com.selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.ImageInputStreamImpl;
import java.util.concurrent.TimeUnit;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        String bashURL="https://mail.rediff.com/cgi-bin/login.cgi";

        driver.get(bashURL);

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);

        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();


    }




}

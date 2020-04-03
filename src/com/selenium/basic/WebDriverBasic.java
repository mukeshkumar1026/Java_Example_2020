package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebDriverBasic {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String bashURL = "http://www.google.com/";
        driver.get(bashURL);
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google");
        if (title.equals("Google")){

            System.out.println("Correct title");
        }

        else {
            System.out.println("Incorrect title");
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}

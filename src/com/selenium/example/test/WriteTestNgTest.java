package com.selenium.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WriteTestNgTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://freecrm.co.in/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void verifyPageTitleTest(){

        String title=driver.getTitle();
        System.out.println("The page title"+title);
        Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}

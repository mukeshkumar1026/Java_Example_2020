package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitConcepts {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.get("http://www.facebook.com/");

        clickOn(driver, driver.findElement(By.id("cookie-use-link")),30);
    }

    public static void clickOn(WebDriver driver, WebElement locator,int timeout){

        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).
                until(ExpectedConditions.elementToBeClickable(locator));


    }
}

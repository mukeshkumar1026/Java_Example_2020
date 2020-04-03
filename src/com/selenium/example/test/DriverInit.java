package com.selenium.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

    private static DriverInit instanceDriver = null;
    private WebDriver driver;

    private DriverInit() {


    }

    public WebDriver openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        return driver;
    }

    public static DriverInit getInstance() {

        if (instanceDriver == null) {

            instanceDriver = new DriverInit();
            return instanceDriver;
        }
        return null;
    }
}
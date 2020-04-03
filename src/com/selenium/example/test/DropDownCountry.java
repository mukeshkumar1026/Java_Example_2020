package com.selenium.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownCountry {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    Select s=new Select(driver.findElement(By.id("countries")));
    List<WebElement> dd_options=s.getOptions();
        System.out.println("The total number of countries ---" +dd_options.size());
        int i=0;
        for(WebElement e:dd_options){
        System.out.println(i+ "." +e.getText());
        i++;
    }
        driver.close();
}
}

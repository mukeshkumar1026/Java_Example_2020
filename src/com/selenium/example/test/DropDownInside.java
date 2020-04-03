package com.selenium.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownInside {

        @Test
        public void testcase1(){

            System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
            driver.manage().window().maximize();
            Select tools=new Select(driver.findElement(By.id("tools")));
            List actualList=new ArrayList();
            List<WebElement> myTools=tools.getOptions();
            for(WebElement ele:myTools){
                String data=ele.getText();
                actualList.add(data);
            }
            List temp=new ArrayList();
            temp.addAll(actualList);
//Ascending.....Collections.sort(temp,Collections.reverseOrder());
            Collections.sort(temp);
            Assert.assertTrue(actualList.equals(temp));
        }
    }
//


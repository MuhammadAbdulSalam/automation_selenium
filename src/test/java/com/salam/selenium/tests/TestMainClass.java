package com.salam.selenium.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class TestMainClass {

    ChromeDriver chromeDriver= new ChromeDriver();

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/automation_selenium/chromedriver");
        chromeDriver.get("https://amaninja-concept2.myshopify.com/password");
    }


    @Test
    public void runMyBrowser() throws InterruptedException {
        Thread.sleep(5000);
        WebElement passwordField = chromeDriver.findElement(By.id("password"));
        passwordField.sendKeys("anything!!");
        Thread.sleep(3000);
    }


    @After
    public void exitChrome(){
        chromeDriver.quit();
    }


}

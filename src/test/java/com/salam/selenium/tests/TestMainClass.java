package com.salam.selenium.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class TestMainClass {

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/automation_selenium/chromedriver");
    }

    @Test
    public void runMyBrowser(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.co.uk/");
    }

    @Test
    public void myFirstTest() throws Exception {
        ArrayList<String> numberArray = new ArrayList<String>();
        numberArray.add("salam"); // 0
        numberArray.add("two"); // 1
        numberArray.add("three");
        numberArray.add("four");
        numberArray.add("five");
        numberArray.add("six");
        numberArray.add("seven");
        numberArray.add("eight");
        numberArray.add("nine"); //8

        for (int i = 0; i < 9; i = i+2){
            System.out.println(numberArray.get(i));
        }

        Assert.assertNotEquals(numberArray.get(0), "idiot");

    }

}

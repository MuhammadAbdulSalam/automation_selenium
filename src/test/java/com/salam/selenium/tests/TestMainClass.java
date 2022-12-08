package com.salam.selenium.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class TestMainClass {

    //initialise your chrome driver here
    ChromeDriver chromeDriver= new ChromeDriver();


    @Test
    public void my_browser_is_up_and_running_and_website_is_loaded() {

        // let the environment know what driver to use
        // System.setProperty("NAME_OF_DRIVER", "LOCATION_OF_DRIVER")
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        // to get URL from element
        chromeDriver.get("https://amaninja-concept2.myshopify.com/password");
    }



    @Test
    public void enter_password_and(String password, String secondPassword) {

        //ArrayList<TYPE> nameOfArray = new ArrayList<TYPE>();
        ArrayList<String> passwordArray = new ArrayList<String>();
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");

        //for each item in object/array/collection loop
        for (String pass : passwordArray) {
        }

        //for(int indexStart; condition; increment) loop
        for(int i = 0; i < 10; i++){

        }

        //while(condition) loop
//        while(true){
//            System.out.println("print this line");
//        }

        //get element by ID is best way since xpath can change in future
        WebElement passwordField = chromeDriver.findElement(By.id("password"));

        // perform actions on web elements- send keys- types on the element
        passwordField.sendKeys("pass");

        WebElement buttonEnter = chromeDriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        buttonEnter.click();

        String exp = ("https://amaninja-concept2.myshopify.com/");
        String act = "https://amaninja-concept2.myshopify.com/";

        Assert.assertEquals("", "");
        Assert.assertNotEquals(exp, act);

    }

    @Test
    public void validate_success_login() {
        chromeDriver.quit();
    }


}

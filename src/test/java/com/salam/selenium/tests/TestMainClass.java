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

    ChromeDriver chromeDriver= new ChromeDriver();

    @Given("My browser is up and running and website is loaded")
    public void my_browser_is_up_and_running_and_website_is_loaded() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        chromeDriver.get("https://amaninja-concept2.myshopify.com/password");
    }

    @Then("Go to site Enter Username {string}")
    public void go_to_site_enter_username(String string) {

    }


    @Then("Enter Password {string} and {string}")
    public void enter_password_and(String password, String secondPassword) {

        ArrayList<String> passwordArray = new ArrayList<String>();
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");
        passwordArray.add("asdasd");

        for (String pass : passwordArray) {
            WebElement passwordField = chromeDriver.findElement(By.id("password"));
            passwordField.sendKeys(pass);
            WebElement buttonEnter = chromeDriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
            buttonEnter.click();

            String exp = ("https://amaninja-concept2.myshopify.com/");
            String act = "https://amaninja-concept2.myshopify.com/";

            Assert.assertNotEquals(exp, act);
        }

    }


    @Then("validate success login")
    public void validate_success_login() {
        chromeDriver.quit();
    }


}

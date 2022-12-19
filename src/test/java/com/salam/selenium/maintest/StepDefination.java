package com.salam.selenium.maintest;

import com.salam.selenium.util.Calculator;
import com.salam.selenium.util.TableHelper;
import com.salam.selenium.util.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class StepDefination {

    WebDriver chromeDriver = new ChromeDriver();

    @Given("browser is on")
    public void browser_is_on() {
       System.setProperty("webdriver.chrome.driver", "chromedriver");
       chromeDriver.get("https://amaninja-concept2.myshopify.com/");
    }

    @Then("Enter password {string}")
    public void enter_password(String password) throws InterruptedException {
        WebElement passwordTextField = chromeDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordTextField.sendKeys(password);
        Thread.sleep(3000);
    }

    @Then("Click on sign in")
    public void click_on_sign_in() throws InterruptedException {
        WebElement enterPasswordButton = chromeDriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        enterPasswordButton.click();
        Thread.sleep(3000);

    }

    @Then("check my data table")
    public void check_my_data_table(DataTable dataTable) {

    }

    @Then("close browser")
    public void closeBrowser() {
        chromeDriver.quit();
    }
}

package com.salam.selenium.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPageObject {

    WebDriver driver;

    public ContactUsPageObject(WebDriver webDriver) {
        this.driver = webDriver;
    }

    By etName = By.xpath("//*[@id=\"ContactForm-name\"]");
    By etEmail = By.xpath("");
    By etPhone = By.xpath("");
    By etComment = By.xpath("");
    By btnSend = By.xpath("");


    public void setNameValue(String keysToPass){
       WebElement name = driver.findElement(etName);
       name.sendKeys(keysToPass);
    }

    public void setEmailValue(String keysToPass){
        WebElement email = driver.findElement(etEmail);
        Assert.assertEquals(email.isDisplayed(), true);
        email.sendKeys(keysToPass);
    }

    public void setPhoneValue(String keysToPass){
        WebElement phone = driver.findElement(etPhone);
        phone.sendKeys(keysToPass);
    }

    public void setCommentValue(String keysToPass){
        WebElement comment = driver.findElement(etComment);
        comment.sendKeys(keysToPass);
    }

    public void fillInMyDetails(){
        setPhoneValue("12312312");
        setEmailValue("email@email.com");
        setCommentValue("comment");
    }

    public void clickSend(){

    }







}

package com.salam.selenium.tests;


import com.salam.selenium.utils.DataMapperUtility;
import com.salam.selenium.utils.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class CucumberTestsExample {
    DataMapperUtility dataMapperUtility = new DataMapperUtility();

    protected WebDriver webDriver = new ChromeDriver();

    @Given("My browser is up and running and website is loaded {int}")
    public void my_browser_is_up_and_running_and_website_is_loaded(Integer int1) {
        ContactUsPageObject myContactUsPageObject =  new ContactUsPageObject(webDriver);

        myContactUsPageObject.setNameValue("salam");
        myContactUsPageObject.setEmailValue("salam@salam.com");
        myContactUsPageObject.setPhoneValue("0712341243");
    }

    @Then("Test using following data")
    public void test_using_following_data(DataTable dataTable) {

        ArrayList<User> myUsersList =  dataMapperUtility.mapDataTableToArrayOfUsers(dataTable);
    }

    @Then("test users data on contact page")
    public void test_user_contact(DataTable dataTable){

        ArrayList<User> myUsersList =  dataMapperUtility.mapDataTableToArrayOfUsers(dataTable);

    }

    @Then("test users data on home page")
    public void test_user_home(DataTable dataTable){

        ArrayList<User> myUsersList =  dataMapperUtility.mapDataTableToArrayOfUsers(dataTable);

    }

}

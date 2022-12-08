package com.salam.selenium.tests;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CucumberTestsExample {

    @Given("My browser is up and running and website is loaded {int}")
    public void my_browser_is_up_and_running_and_website_is_loaded(Integer int1) {

    }
    @Then("Go to site Enter Username {string}")
    public void go_to_site_enter_username(String userName) {
        System.out.println(userName);
    }
    @Then("Enter Password {string} and {string}")
    public void enter_password_and(String string, String string2) {

    }
    @Then("validate success login")
    public void validate_success_login() {

    }


}

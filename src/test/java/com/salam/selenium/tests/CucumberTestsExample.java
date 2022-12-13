package com.salam.selenium.tests;


import com.salam.selenium.utils.DataTableHelper;
import com.salam.selenium.utils.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;

public class CucumberTestsExample {

    @Given("My browser is up and running and website is loaded {int}")
    public void my_browser_is_up_and_running_and_website_is_loaded(Integer int1) {

    }

    @Then("Test using following data")
    public void test_using_following_data(DataTable dataTable) {

        DataTableHelper dataTableHelper = new DataTableHelper();

        dataTableHelper.printDataTableValues(dataTable);

        ArrayList<User> myUsersList = dataTableHelper.getUsersList(dataTable); //this will return me a list of users

        dataTableHelper.printMyUsersList(myUsersList);

        int x = 1;

        /**
         * operators values
         * < less than
         * > greater than
         * == equals to
         * >= either greater or equal
         * <= either less or equals
         */
        if( x == 1 ){
          System.out.println("X is One");
        }
        else if(x == 2){

        }
        else {
            System.out.println("X is not equals to one");
        }

    }

}

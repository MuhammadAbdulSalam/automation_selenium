package com.salam.selenium.tests;


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
        int numberOfRows = dataTable.height();
        int numberOfColumns = dataTable.width();

        //how to read elements one by one
        String firstNameFirstRow = dataTable.row(0).get(0);
        String secondNameFirstRow = dataTable.row(0).get(1);

        System.out.println("First Name : " + firstNameFirstRow + " ,Second Name: " + secondNameFirstRow);

        //For loop to run through data tables
        for (int i = 0; i < dataTable.height(); i++){

            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);

            System.out.println("FirstName: " + firstName);
            System.out.println("SecondName: " + secondName);
            System.out.println("email: " + email);
            System.out.println("---From First Loop---");
        }

        //example how to create new objects
        User myUser = new User("abdul", "salam", "test@test.com");

        //create a list of users so i can add my user objects to it
        ArrayList<User> myUsersList = new ArrayList<User>();

        //map the data table onto an object -> in this case a User Object
        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);

            User mUser = new User(firstName, secondName, email);
            myUsersList.add(mUser); // add my user object into myUsersList
        }

        //for each loop -> for each element in the array run this loop
        for (User user: myUsersList){
            System.out.println(user.getUserFirstName());
            System.out.println(user.getUserSecondName());
            System.out.println(user.getUserEmail());
            System.out.println("---From Second Loop---");
        }
    }


}

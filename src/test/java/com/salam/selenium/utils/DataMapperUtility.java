package com.salam.selenium.utils;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;

public class DataMapperUtility {

    /**
     * @param dataTable pass it from your function
     * This function will print my data table values in a single line each field
     */
    public void printMyDataTable(DataTable dataTable){

        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);
            printMyValues(firstName, secondName, email);
        }

    }

    /**
     *
     * @param dataTable datatable that needs to be mapped onto ArrayList<User>
     *
     * @return arrayList of Users mapped from data table
     */
    public ArrayList<User> mapDataTableToArrayOfUsers(DataTable dataTable){
        //create a list of users so i can add my user objects to it

        printMyDataTable(dataTable);

        ArrayList<User> myUsersList = new ArrayList<User>();

        //map the data table onto an object -> in this case a User Object
        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);

            User mUser = new User(firstName, secondName, email);
            myUsersList.add(mUser); // add my user object into myUsersList
        }

        for (User user: myUsersList){
            printMyValues(user.getUserFirstName(), user.getUserSecondName(), user.getUserEmail());
        }

        return myUsersList;
    }

    public void printMyValues(String firstName, String secondName, String email){
        System.out.println("FirstName: " + firstName + " SecondName: " + secondName + " Email: " + email);
    }

}

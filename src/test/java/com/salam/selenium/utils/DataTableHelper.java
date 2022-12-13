package com.salam.selenium.utils;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;

public class DataTableHelper {

    public void printDataTableValues(DataTable dataTable){

        for (int i = 0; i < dataTable.height(); i++){

            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);

            System.out.println("FirstName: " + firstName);
            System.out.println("SecondName: " + secondName);
            System.out.println("email: " + email);
            System.out.println("---From First Loop---");
        }

    }

    public ArrayList<User> getUsersList(DataTable dataTable){
        ArrayList<User> myUsersList = new ArrayList<User>();

        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String email = dataTable.row(i).get(2);

            User mUser = new User(firstName, secondName, email);
            myUsersList.add(mUser); // add my user object into myUsersList
        }

        return myUsersList;
    }

    public void printMyUsersList(ArrayList<User> myUsersList){
        for (User user: myUsersList){
            System.out.println(user.getUserFirstName());
            System.out.println(user.getUserSecondName());
            System.out.println(user.getUserEmail());
            System.out.println("---From Second Loop---");
        }
    }

}

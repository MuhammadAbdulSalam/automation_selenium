package com.salam.selenium.util;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;

public class TableHelper {

    /**
     * @param dataTable data table that we need to use for function
     *
     * This function takes a data table and prints all values
     */
    public void printMyTable(DataTable dataTable){
        for (int i = 0; i < dataTable.height(); i++){
            String firstName =  dataTable.row(i).get(0);
            String secondName =  dataTable.row(i).get(1);
            String email =  dataTable.row(i).get(2);

            System.out.println(firstName);
            System.out.println(secondName);
            System.out.println(email);
            System.out.println("--------------------");

        }
    }

    public void printMyArrayList(ArrayList<User> myUsersList){
        for (User user : myUsersList) {
            System.out.println(user.getFirstName());
            System.out.println(user.getSecondName());
            System.out.println(user.getEmail());
        }
    }


    public void printAline(){
        System.out.println("print this");
    }

    public void printTwoLines(){
        System.out.println("print one line");
        System.out.println("print second line");
    }

    public String getMyStringValue(){
        String aValue = "this is a string value";
        return aValue;
    }

    public int getMyNumber(){
        int x = 123;
        return x;
    }

    public int getSumOfNumber(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }

}

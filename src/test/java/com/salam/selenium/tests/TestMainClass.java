package com.salam.selenium.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMainClass {

    @Test
    public void myFirstTestFunction(){
        String myFirstString = "Hello";
        String mySecondString = "World";
        String sumOfStrings = myFirstString + mySecondString;
        int myFirstNumber = 1;
        int mySecondNumber = 2;
        int sum = myFirstNumber + mySecondNumber;
        int multiply = myFirstNumber * mySecondNumber;
        int divide = myFirstNumber / mySecondNumber;
        int subtract = myFirstNumber - mySecondNumber;
        System.out.println(sumOfStrings);
    }

}

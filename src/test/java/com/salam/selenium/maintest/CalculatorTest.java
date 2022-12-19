package com.salam.selenium.maintest;


import com.salam.selenium.util.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {



    @Test
    public void calculatorTest(){

        Calculator myCalculator = new Calculator("Calculator", 10);

        int myFunctionResult = myCalculator.addition(5, 3);

        boolean isResult = myCalculator.isNumberBiggerThenBaseNumber(myFunctionResult);

        myCalculator.setBaseNumber(5);

        boolean newResult = myCalculator.isNumberBiggerThenBaseNumber(myFunctionResult);
    }






}

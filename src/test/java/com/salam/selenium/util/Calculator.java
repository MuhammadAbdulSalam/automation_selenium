package com.salam.selenium.util;

public class Calculator {

    String className;
    int baseNumber;

    public Calculator(String classValue, int numberValue) {
        this.className = classValue;
        this.baseNumber = numberValue;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public int addition(int numberOne, int numberTwo){
        int result = numberOne + numberTwo;
        return result;
    }

    public Boolean isNumberBiggerThenBaseNumber(int numberToCheck){
        System.out.println(className);

        if(numberToCheck > baseNumber){
            return true;
        }
        else {
            return false;
        }
    }




}

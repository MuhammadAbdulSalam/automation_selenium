package com.salam.selenium.utils;

public class CalculationsClass {

    /**
     * public void -FUNCTION_NAME- (params here){ }
     * in order to return a value. use DataType instead of void. See example addTwoTexts
     */

    public int additionFunction(int one, int two){
        int result = one + two;
        System.out.println(result);
        return result;
    }

    public void multiplicationFunction(int one, int two, String text){
        int result = one * two;
        System.out.println(text + result);
    }

    public void subtractionFunction(int one, int two){
        int result = one - two;
        System.out.println(result);
    }

    public String addTwoTexts(String one, String two){
        String result = one + two;
        return result;
    }

}

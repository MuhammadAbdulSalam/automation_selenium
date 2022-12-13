package com.salam.selenium.tests;

import com.salam.selenium.utils.CalculationsClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CleanCode {

    /**
     * Only create new variables when needed more than once.
     *
     * if logic is being reused, then create it as a function
     */
    @Test
    public void calculator(){
        CalculationsClass calculationsClass = new CalculationsClass();

        calculationsClass.additionFunction(2,3);
        calculationsClass.subtractionFunction(4,3);

        int result = calculationsClass.additionFunction(3, 4);
        Assert.assertEquals(7, result);
        String resultText = calculationsClass.addTwoTexts("Text One", "Text Two");

        System.out.println(result);

    }






}

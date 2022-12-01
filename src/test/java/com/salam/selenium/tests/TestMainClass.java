package com.salam.selenium.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RunWith(JUnit4.class)
public class TestMainClass {

    @Test
    public void myFirstTest() throws Exception {
        ArrayList<String> numberArray = new ArrayList<String>();
        numberArray.add("one"); // 0
        numberArray.add("two"); // 1
        numberArray.add("three");
        numberArray.add("four");
        numberArray.add("five");
        numberArray.add("six");
        numberArray.add("seven");
        numberArray.add("eight");
        numberArray.add("nine"); //8

        for (int i = 0; i < 9; i = i+2){
            System.out.println(numberArray.get(i));
        }

    }

}

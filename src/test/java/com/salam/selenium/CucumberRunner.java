package com.salam.selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"}, //feature - location of your feature files - if under resources. you can use classpath:features
        glue = {"com.salam.selenium.tests"}, //glue - where your test files java tests are -step defination
        plugin = { "pretty", "html:target/cucumber-reports" } // this is to create html reports
)
public class CucumberRunner { }

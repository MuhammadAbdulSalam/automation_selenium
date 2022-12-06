package com.salam.selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.salam.selenium.tests"},
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class CucumberRunner { }

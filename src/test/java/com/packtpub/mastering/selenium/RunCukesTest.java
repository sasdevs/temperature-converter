package com.packtpub.mastering.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sdaita on 12/25/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        format = {"pretty", "html:target/cucumber-html"}
)

public class RunCukesTest {
}

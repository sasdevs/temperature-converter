package com.packtpub.mastering.selenium;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

/**
 * Created by sdaita on 12/25/2016.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        features ="src/test/resources",
        format = {"pretty", "html:target/cucumber-htmlreport",
        "json-pretty:target/cucumber-report.json"})

public class RunCukesTest {
}


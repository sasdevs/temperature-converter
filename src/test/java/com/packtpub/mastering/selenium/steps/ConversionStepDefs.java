package com.packtpub.mastering.selenium.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sdaita on 12/26/2016.
 */
public class ConversionStepDefs {
    @Given("^I want to convert (\\d+)\\.(\\d+) F to C$")
    public void i_want_to_convert_F_to_C(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I input the value of F as (\\d+)\\.(\\d+) in text field$")
    public void i_input_the_value_of_F_as_in_text_field(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^it should be converted to C as (\\d+) degrees$")
    public void it_should_be_converted_to_C_as_degrees(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}

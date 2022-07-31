package com.mypackage.steps;

import com.mypackage.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();

    @Given("^Open Calculator App$")
    public void openCalculatorApp() {
        homePage.verifyOpenAppSucceed();
    }

    @Then("^The screen display total correct$")
    public void theScreenDisplayTotalCorrect() {
        homePage.verifyResult();
    }

    @When("^I sum from (\\d+) to (\\d+)$")
    public void iSumFromTo(int numberTo, int numberFrom) {
        homePage.sumTotal(numberTo,numberFrom);
    }
}

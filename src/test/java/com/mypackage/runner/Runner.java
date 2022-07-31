package com.mypackage.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoCalculator.feature",
        glue = "com.mypackage.steps",
        tags = "",
        plugin = {"pretty", "json:target/cucumber-json/demoCalculator.feature/cucumber.json"})

public class Runner {
}
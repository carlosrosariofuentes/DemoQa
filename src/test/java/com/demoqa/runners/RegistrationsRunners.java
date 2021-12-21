package com.demoqa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registration.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.demoqa.stepdefinitios",
        dryRun = false


)

public class RegistrationsRunners {
}

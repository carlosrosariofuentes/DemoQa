package com.demoqa.stepdefinitios;

import com.demoqa.questions.AlertQuestions;
import com.demoqa.tasks.AlertsTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class AlertsStepsDefinitions {

    @Managed( driver = "chrome")
    private WebDriver browser;

    private Actor actor = Actor.named("Carlos");
    @Before
    public void setUp(){
         actor.can(BrowseTheWeb.with(browser));
    }


    @Given("^i want to access the page de alert$")
    public void iWantToAccessThePageDeAlert() {
        actor.wasAbleTo(Open.url("https://demoqa.com/alerts"));


    }

    @When("^i press all the buttons present on the page$")
    public void iPressAllTheButtonsPresentOnThePage() {
        actor.wasAbleTo(AlertsTasks.darClick());

    }



    @Then("^the test was successful$")
    public void theTestWasSuccessful() {
        actor.should(GivenWhenThen.seeThat(AlertQuestions.compare()
                , Matchers.is(Matchers.equalTo("You entered Carlos"))));

    }
}

package com.demoqa.stepdefinitios;

import com.demoqa.tasks.WindowsTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class WindowsStepsDefinitions {
    @Managed
    private WebDriver browser;

    @Before

    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Carlos");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(browser));
    }


    @Given("^i want to access the page de windows$")
    public void iWantToAccessThePageDeWindows() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/browser-windows"));
    }


    @When("^i press all the buttons present on the page the windows$")
    public void iPressAllTheButtonsPresentOnThePageTheWindows() {
        OnStage.theActorInTheSpotlight().wasAbleTo(WindowsTasks.darClick());

    }

    @Then("^the a windows test was successful$")
    public void theAWindowsTestWasSuccessful() {

    }
}

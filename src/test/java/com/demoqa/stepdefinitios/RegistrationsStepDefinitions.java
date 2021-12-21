package com.demoqa.stepdefinitios;

import com.demoqa.models.DataRegister;
import com.demoqa.questions.RegisterQuestions;
import com.demoqa.tasks.RegisterTasks;
import com.demoqa.userinterfase.RegisterForm;
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

import java.util.List;

public class RegistrationsStepDefinitions {
     @Managed( driver = "chrome")
     private WebDriver browser;

     private Actor actor = Actor.named("Carlos");
     private RegisterForm registerForm = new RegisterForm();



    @Given("i want to access the student registration form")
    public void iWantToAccessTheStudentRegistrationForm() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(registerForm));


    }
    @When("i enter all data in form fields")
    public void iEnterAllDataInFormFields(List <DataRegister>dataList) {
        DataRegister dataRegister;
        dataRegister=dataList.get(0);
        actor.wasAbleTo(RegisterTasks.registerUser(dataRegister));


    }
    @Then("I see a successful registration")
    public void iSeeASuccessfulRegistration() {
        actor.should(GivenWhenThen.seeThat(RegisterQuestions.compare()
                , Matchers.is(Matchers.equalTo("Thanks for submitting the form"))));
    }

}

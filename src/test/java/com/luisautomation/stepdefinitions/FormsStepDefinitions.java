package com.luisautomation.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FormsStepDefinitions {

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^selects the option Forms$")
    public void selectsTheOptionForms() {

    }


    @When("^selects the option Practice Form$")
    public void selectsTheOptionPracticeForm() {

    }

    @When("^complete the information of form$")
    public void completeTheInformationOfForm() {

    }

    @Then("^validate client information$")
    public void validateClientInformation( ) {

    }


}

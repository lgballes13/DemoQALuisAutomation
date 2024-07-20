package com.luisautomation.stepdefinitions;

import com.luisautomation.interactions.SelectsAlertsFrames;
import com.luisautomation.interactions.SelectsModal;
import com.luisautomation.questions.ValidateDailogsModal;
import com.luisautomation.tasks.SelectsLargeModal;
import com.luisautomation.tasks.SelectsSmallModal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AlertsFramesStepDefinitions {


    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^selects the option Alerts frames and windows$")
    public void selectsTheOptionAlertsFramesAndWindows() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsAlertsFrames.andWindowsOption());
    }


    @When("^selects the option Modal Dialogs$")
    public void selectsTheOptionModalDialogs() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsModal.dialogsOption());
    }

    @When("^interact whit small modal$")
    public void interactWhitSmallModal() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsSmallModal.option());
    }

    @Then("^validate message small modal$")
    public void validateMessageSmallModal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate modal dialog small", ValidateDailogsModal.small()));
    }

    @When("^interact with large modal$")
    public void interactWithLargeModal() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsLargeModal.option());
    }

    @Then("^validate message large modal$")
    public void validateMessageLargeModal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate modal dialog large", ValidateDailogsModal.large()));
    }

}

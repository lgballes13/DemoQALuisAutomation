package com.luisautomation.stepdefinitions;

import com.luisautomation.interactions.SelectsForm;
import com.luisautomation.interactions.SelectsPracticeForm;
import com.luisautomation.models.FormModel;
import com.luisautomation.questions.ValidateInformation;
import com.luisautomation.questions.ValidateTextBox;
import com.luisautomation.tasks.InsertInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import org.jsoup.helper.Validate;

import java.util.List;

public class FormsStepDefinitions {

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^selects the option Forms$")
    public void selectsTheOptionForms() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsForm.option());
    }


    @When("^selects the option Practice Form$")
    public void selectsTheOptionPracticeForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsPracticeForm.option());
    }

    @When("^complete the information of form$")
    public void completeTheInformationOfForm(List<FormModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertInformation.ofClient(data));

    }

    @Then("^validate client information$")
    public void validateClientInformation(List<FormModel> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate firstname", ValidateInformation.firstName(), CoreMatchers.containsString(data.get(0).getFirstName())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate lastname", ValidateInformation.lastName(), CoreMatchers.containsString(data.get(0).getLastName())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate email", ValidateInformation.email(), CoreMatchers.containsString(data.get(0).getEmail())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate gender", ValidateInformation.gender(), CoreMatchers.containsString(data.get(0).getGender())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate mobile", ValidateInformation.mobile(), CoreMatchers.containsString(data.get(0).getMobile())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate day birth", ValidateInformation.day(), CoreMatchers.containsString(data.get(0).getDay())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate mont birth", ValidateInformation.day(), CoreMatchers.containsString(data.get(0).getMonth())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate year birth", ValidateInformation.day(), CoreMatchers.containsString(data.get(0).getYear())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate address", ValidateInformation.address(), CoreMatchers.containsString(data.get(0).getCurrentAddress())));
    }


}

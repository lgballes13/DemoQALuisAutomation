package com.luisautomation.stepdefinitions;

import com.luisautomation.interactions.*;
import com.luisautomation.models.TextBoxModel;
import com.luisautomation.models.WebTableModel;
import com.luisautomation.questions.*;
import com.luisautomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;

import java.util.List;

public class ElementsStepDefinitions {



    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the client is on the homepage$")
    public void theClientIsOnTheHomepage() {
        OnStage.theActorCalled("user").wasAbleTo(Open.url("https://demoqa.com/"));

    }


    @When("^selects the option Elements$")
    public void selectsTheOptionElements() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsElement.option());
    }

    @When("^selects the option Text Box$")
    public void selectsTheOptionTextBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsTextBox.option());
    }

    @When("^complete the information$")
    public void completeTheInformation(List<TextBoxModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(TextBox.information(data));
    }

    @Then("^validate information registered$")
    public void validateInformationRegistered(List<TextBoxModel> datamodel) {
        System.out.println(datamodel.get(0).getFullName());
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message name", ValidateTextBox.name(), CoreMatchers.containsString(datamodel.get(0).getFullName())));
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message email", ValidateTextBox.email(), CoreMatchers.containsString(datamodel.get(0).getEmail())));
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message address", ValidateTextBox.currentAddress(), CoreMatchers.containsString(datamodel.get(0).getCurrentAddress())));
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message permanent address", ValidateTextBox.permanentAddress(), CoreMatchers.containsString(datamodel.get(0).getPermanentAddress())));
    }

    //checkbox

    @When("^selects the option Check Box$")
    public void selectsTheOptionCheckBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsCheckBox.option());
    }


    @When("^select the option Notes of Desktop$")
    public void selectTheOptionNotesOfDesktop() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsNotes.ofDesktop());
    }

    @Then("^validate that the message You have selected contains \"([^\"]*)\"$")
    public void validateThatTheMessageYouHaveSelectedContains(String notes) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate checkbox notes desktop", ValidateCheckBox.notes(), CoreMatchers.containsString(notes)));
    }

    @When("^select the option Documents$")
    public void selectTheOptionDocuments() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsDocuments.option());
    }

    @Then("^validate that the message You have selected contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validateThatTheMessageYouHaveSelectedContainsAnd(String workspace, String office) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate checkbox workspace", ValidateCheckBox.workspace(), CoreMatchers.containsString(workspace)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate checkbox office", ValidateCheckBox.office(), CoreMatchers.containsString(office)));
    }

    @When("^select the option Word Filedoc of Downloads$")
    public void selectTheOptionWordFileDocOfDownloads() {
       OnStage.theActorInTheSpotlight().attemptsTo(SelectsWordFile.ofDownloads());
    }

    @Then("^validate that message You have selected contains \"([^\"]*)\"$")
    public void validateThatMessageYouHaveSelectedContains(String wordFile) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate checkbox downloads", ValidateCheckBox.wordFile(), CoreMatchers.containsString(wordFile)));
    }


    //radio

    @When("^selects the option Radio Button$")
    public void selectsTheOptionRadioButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsRadioButton.option());
    }


    @When("^selects the Yes option$")
    public void selectsTheYesOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsYes.radioOption());
    }

    @Then("^validate \"([^\"]*)\" in the message You have selected$")
    public void validateInTheMessageYouHaveSelected(String yes) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate option yes of radio button", ValidateRadioButton.yes(), CoreMatchers.containsString(yes)));
    }

    @Then("^selects the Impressive option$")
    public void selectsTheImpressiveOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsImpressive.radioOption());
    }

    @Then("^validate \"([^\"]*)\" in message You have selected$")
    public void validateInMessageYouHaveSelected(String impressive) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate option impressive of radio button", ValidateRadioButton.impressive(), CoreMatchers.containsString(impressive)));
    }

    //webtable

    @When("^selects the option Web tables$")
    public void selectsTheOptionWebTables() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsWebTables.option());
    }


    @When("^complete the information of form for new register$")
    public void completeTheInformationOfFormForNewRegister(List<WebTableModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddInformation.forRegister(data));
    }

    @Then("^validate the information in the table$")
    public void validateTheInformationInTheTable(List<WebTableModel> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message firstname", ValidateRegister.firstName(data.get(0).getFirstName()), CoreMatchers.containsString(data.get(0).getFirstName())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message lastname", ValidateRegister.lastName(data.get(0).getLastName()), CoreMatchers.containsString(data.get(0).getLastName())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message email", ValidateRegister.email(data.get(0).getEmail()), CoreMatchers.containsString(data.get(0).getEmail())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message age", ValidateRegister.age(data.get(0).getAge()), CoreMatchers.containsString(data.get(0).getAge())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message salary", ValidateRegister.salary(data.get(0).getSalary()), CoreMatchers.containsString(data.get(0).getSalary())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message department", ValidateRegister.department(data.get(0).getDepartment()), CoreMatchers.containsString(data.get(0).getDepartment())));
    }

    @When("^edit the form information$")
    public void editTheFormInformation(List<WebTableModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditInformation.forRegister(data));
    }


    @When("^eliminate the register$")
    public void eliminateTheRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteInformation.forRegister());
    }


    @Then("^validate the register not exist$")
    public void validateTheRegisterNotExist() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateDelete.ofRegister()));
    }

    //buttons

    @When("^selects the option Buttons$")
    public void selectsTheOptionButtons() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsButton.option());
    }


    @When("^interact with the different buttons$")
    public void interactWithTheDifferentButtons() {
      OnStage.theActorInTheSpotlight().attemptsTo(ButtonsClick.option());
    }

    @Then("^validate the respective message for each button$")
    public void validateTheRespectiveMessageForEachButton() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message doubleClick present", ValidateButtton.doubleClick()));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message rightClick present", ValidateButtton.rightClick()));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message meClick present", ValidateButtton.meClick()));
    }

    //links

    @When("^selects the option Links$")
    public void selectsTheOptionLinks() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsLink.option());
    }


    @When("^select the home link$")
    public void selectTheHomeLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsLinkHome.option());
    }

    @Then("^validate hompage in the new tab$")
    public void validateHompageInTheNewTab() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate message homepage present", ValidateLinks.home()));
    }

    @When("^select the dynamic home link$")
    public void selectTheDynamicHomeLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsDynamicLink.option());
    }

    @When("^select the created link$")
    public void selectTheCreatedLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsCreatedLink.option());
    }

    @Then("^validate status \"([^\"]*)\"$")
    public void validateStatus(String created) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status created", ValidateLinks.created(), CoreMatchers.containsString(created)));

    }

    @When("^select the no content link$")
    public void selectTheNoContentLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsNoContentLink.option());
    }

    @When("^select the moved link$")
    public void selectTheMovedLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsMoveLink.option());
    }

    @When("^select the bad request link$")
    public void selectTheBadRequestLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsBadRequestLink.option());
    }

    @When("^select the unauthorized link$")
    public void selectTheUnauthorizedLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsUnauthorizedLink.option());
    }

    @When("^select the forbidden link$")
    public void selectTheForbiddenLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsForbiddenLink.option());
    }

    @When("^select the not found link$")
    public void selectTheNotFoundLink() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsNotFoundLink.option());
    }

    @Then("^validate status nc \"([^\"]*)\"$")
    public void validateStatusNc(String nc) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status no content", ValidateLinks.noContent(), CoreMatchers.containsString(nc)));
    }


    @Then("^validate status mp \"([^\"]*)\"$")
    public void validateStatusMp(String mp) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status moved", ValidateLinks.moved(), CoreMatchers.containsString(mp)));
    }

    @Then("^validate status br \"([^\"]*)\"$")
    public void validateStatusBr(String br) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status bad request", ValidateLinks.badRequest(), CoreMatchers.containsString(br)));
    }

    @Then("^validate status u \"([^\"]*)\"$")
    public void validateStatusU(String u) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status unauthorized", ValidateLinks.unauthorized(), CoreMatchers.containsString(u)));
    }

    @Then("^validate status f \"([^\"]*)\"$")
    public void validateStatusF(String f) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status forbidden", ValidateLinks.forbidden(), CoreMatchers.containsString(f)));
    }

    @Then("^validate status nf \"([^\"]*)\"$")
    public void validateStatusNf(String nf) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate status not found", ValidateLinks.notFound(), CoreMatchers.containsString(nf)));
    }


    //updown

    @When("^selects the option Upload and Download$")
    public void selectsTheOptionUploadAndDownload() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsUpDown.option());
    }


    @When("^upload csv file$")
    public void uploadCsvFile() {
        OnStage.theActorInTheSpotlight().attemptsTo(UploadFile.csv());
    }

    @Then("^visualize the path of file$")
    public void visualizeThePathOfFile() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate filepath present", ValidateUpDown.fileUpload()));
    }

    @When("^Select button Download$")
    public void selectButtonDownload() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectsDownload.fileOption());
    }

    @Then("^validate correct file download$")
    public void validateCorrectFileDownload() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("validate correct download", ValidateDownload.exists("sampleFile.jpeg")));
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteFile.downloaded());
    }

}

package com.luisautomation.tasks;

import com.luisautomation.models.FormModel;
import com.luisautomation.userinterface.FormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.nio.file.Paths;
import java.util.List;

public class InsertInformation implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String month;

    private String year;

    private String day;
    private String subjects;
    private String hobbies;
    private String currentAddress;
    private String state;
    private String city;

    public InsertInformation (List<FormModel> data){
        this.firstName = data.get(0).getFirstName();
        this.lastName = data.get(0).getLastName();
        this.email = data.get(0).getEmail();
        this.gender = data.get(0).getGender();
        this.mobile = data.get(0).getMobile();
        this.month = data.get(0).getMonth();
        this.year = data.get(0).getYear();
        this.day = data.get(0).getDay();
        this.subjects = data.get(0).getSubjects();
        this.hobbies = data.get(0).getHobbies();
        this.currentAddress = data.get(0).getCurrentAddress();
        this.state = data.get(0).getState();
        this.city = data.get(0).getCity();
    }

    public static InsertInformation ofClient(List<FormModel> data){
        return Tasks.instrumented(InsertInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String filePath = "C:/Users/PC/Downloads/serenitybdd-appium-poc-master/DemoQAjuju/sampleFile.jpeg";

        actor.attemptsTo(Enter.theValue(firstName).into(FormsPage.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(FormsPage.TXT_LAST_NAME),
                Enter.theValue(email).into(FormsPage.TXT_EMAIL),
                Click.on(FormsPage.RAD_GENDER.of(gender)),
                Enter.theValue(mobile).into(FormsPage.TXT_MOBILE),
                Click.on(FormsPage.TXT_DATE_BIRTH),
                Click.on(FormsPage.BTN_MONTH),
                Click.on(FormsPage.LIST_MONTH.of(month)),
                Click.on(FormsPage.BTN_YEAR),
                Click.on(FormsPage.LIST_YEAR.of(year)),
                Click.on(FormsPage.BTN_DAY.of(day)),
                Hit.the(Keys.PAGE_DOWN).into("//body"),
                Click.on(FormsPage.BTN_SUBJECT),
                Click.on(FormsPage.LBL_HOBBIES.of(hobbies)),
                Upload.theFile(Paths.get(filePath)).to(FormsPage.BTN_UPLOAD_PICTURE),
                Enter.theValue(currentAddress).into(FormsPage.TXT_ADDRESS),
                Click.on(FormsPage.BTN_LIST_STATE),
                Click.on(FormsPage.LIST_STATE.of(state)),
                Click.on(FormsPage.BTN_LIST_CITY),
                Click.on(FormsPage.LIST_CITY.of(city)),
                Click.on(FormsPage.BTN_SUBMIT)
                );
    }
}

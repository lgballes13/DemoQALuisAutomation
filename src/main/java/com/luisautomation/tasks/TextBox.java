package com.luisautomation.tasks;

import com.luisautomation.models.TextBoxModel;
import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class TextBox implements Task {

    private String fullName;

    private String email;

    private String currentAddress;

    private String permanentAddress;


    public TextBox (List<TextBoxModel> model){

        this.fullName = model.get(0).getFullName();
        this.email = model.get(0).getEmail();
        this.currentAddress = model.get(0).getCurrentAddress();
        this.permanentAddress = model.get(0).getPermanentAddress();


    }

    public static TextBox information(List<TextBoxModel> model){
        return Tasks.instrumented(TextBox.class, model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Hit.the(Keys.PAGE_DOWN).into(TextBoxPage.BODY),
                Enter.theValue(fullName).into(TextBoxPage.TXT_FULL_NAME),
                Enter.theValue(email).into(TextBoxPage.TXT_EMAIL),
                Enter.theValue(currentAddress).into(TextBoxPage.TXT_CURRENT_ADDRESS),
                Enter.theValue(permanentAddress).into(TextBoxPage.TXT_PERMANENT_ADDRESS),
                Click.on(TextBoxPage.BTN_SUBMIT));
    }
}

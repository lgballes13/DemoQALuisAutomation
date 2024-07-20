package com.luisautomation.interactions;

import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsTextBox implements Interaction {

    public static SelectsTextBox option(){
        return Tasks.instrumented(SelectsTextBox.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TextBoxPage.BTN_TEXT_BOX));
    }
}

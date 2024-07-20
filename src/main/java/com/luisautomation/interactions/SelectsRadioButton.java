package com.luisautomation.interactions;

import com.luisautomation.userinterface.RadioButtonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsRadioButton implements Task {

    public static SelectsRadioButton option(){
        return Tasks.instrumented(SelectsRadioButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RadioButtonPage.BTN_RADIO_BUTTON));
    }
}

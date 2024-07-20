package com.luisautomation.interactions;

import com.luisautomation.userinterface.ButtonsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsButton implements Interaction {


    public static SelectsButton option(){
        return Tasks.instrumented(SelectsButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ButtonsPage.BTN_BUTTONS));
    }
}

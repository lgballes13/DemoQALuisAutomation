package com.luisautomation.interactions;

import com.luisautomation.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SelectsForm implements Interaction {

    public static SelectsForm option(){
        return Tasks.instrumented(SelectsForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_FORMS));
    }
}

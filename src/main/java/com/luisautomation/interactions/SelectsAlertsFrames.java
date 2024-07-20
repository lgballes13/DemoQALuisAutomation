package com.luisautomation.interactions;

import com.luisautomation.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsAlertsFrames implements Interaction {

    public static SelectsAlertsFrames andWindowsOption(){
        return Tasks.instrumented(SelectsAlertsFrames.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_ALERTS));
    }
}

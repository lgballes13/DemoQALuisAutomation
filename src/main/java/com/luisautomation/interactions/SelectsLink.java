package com.luisautomation.interactions;

import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsLink implements Interaction {

    public static SelectsLink option(){
        return Tasks.instrumented(SelectsLink.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinksPage.BTN_LINKS));
    }
}

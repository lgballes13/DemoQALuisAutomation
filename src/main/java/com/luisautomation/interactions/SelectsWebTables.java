package com.luisautomation.interactions;

import com.luisautomation.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsWebTables implements Interaction {


    public static SelectsWebTables option(){
        return Tasks.instrumented(SelectsWebTables.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WebTablePage.BTN_WEB_TABLE));
    }
}

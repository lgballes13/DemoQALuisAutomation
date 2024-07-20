package com.luisautomation.interactions;

import com.luisautomation.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsElement implements Interaction{

    public static SelectsElement option (){
        return Tasks.instrumented(SelectsElement.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_ELEMENTS));
    }
}

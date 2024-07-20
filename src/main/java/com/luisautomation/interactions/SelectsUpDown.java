package com.luisautomation.interactions;

import com.luisautomation.userinterface.UpDownPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsUpDown implements Interaction {


    public static SelectsUpDown option(){
        return Tasks.instrumented(SelectsUpDown.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UpDownPage.BTN_UP_DOWN));
    }
}

package com.luisautomation.tasks;

import com.luisautomation.userinterface.RadioButtonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsYes implements Task {

    public static SelectsYes radioOption(){
        return Tasks.instrumented(SelectsYes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RadioButtonPage.RADIO_YES_OPTION));
    }
}

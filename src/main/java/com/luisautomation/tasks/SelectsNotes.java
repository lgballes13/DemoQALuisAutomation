package com.luisautomation.tasks;

import com.luisautomation.userinterface.CheckBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsNotes implements Task {

    public static SelectsNotes ofDesktop(){
        return Tasks.instrumented(SelectsNotes.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckBoxPage.BTN_DESKTOP),
                Click.on(CheckBoxPage.LBL_NOTES));
    }
}

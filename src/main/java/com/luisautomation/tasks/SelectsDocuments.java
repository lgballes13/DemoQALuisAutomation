package com.luisautomation.tasks;

import com.luisautomation.userinterface.CheckBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsDocuments implements Task {


    public static SelectsDocuments option(){
        return Tasks.instrumented(SelectsDocuments.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckBoxPage.LBL_DOCUMENTS));
    }
}

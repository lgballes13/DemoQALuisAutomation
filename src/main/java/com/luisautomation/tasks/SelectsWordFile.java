package com.luisautomation.tasks;

import com.luisautomation.userinterface.CheckBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SelectsWordFile implements Task {


    public static SelectsWordFile ofDownloads(){
        return Tasks.instrumented(SelectsWordFile.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckBoxPage.BTN_DOWNLOADS),
                Click.on(CheckBoxPage.LBL_WORD_FILE));
    }
}

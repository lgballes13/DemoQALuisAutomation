package com.luisautomation.tasks;

import com.luisautomation.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteInformation implements Task {

    public static DeleteInformation forRegister(){
        return Tasks.instrumented(DeleteInformation.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WebTablePage.BTN_DELETE));
    }
}

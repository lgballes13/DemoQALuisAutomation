package com.luisautomation.tasks;

import com.luisautomation.userinterface.ModalDialogsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsLargeModal implements Task {

    public static SelectsLargeModal option(){
        return Tasks.instrumented(SelectsLargeModal.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ModalDialogsPage.BTN_CLOSE_SMALL),
                Click.on(ModalDialogsPage.BTN_MODAL_LARGE));
    }
}

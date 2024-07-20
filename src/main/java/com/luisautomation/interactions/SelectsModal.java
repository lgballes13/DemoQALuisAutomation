package com.luisautomation.interactions;

import com.luisautomation.userinterface.ModalDialogsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsModal implements Interaction {

    public static SelectsModal dialogsOption(){
        return Tasks.instrumented(SelectsModal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ModalDialogsPage.BTN_MODAL_DAILOGS));
    }
}

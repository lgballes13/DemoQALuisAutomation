package com.luisautomation.interactions;

import com.luisautomation.userinterface.FormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsPracticeForm implements Interaction {

    public static SelectsPracticeForm option(){
        return Tasks.instrumented(SelectsPracticeForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormsPage.BTN_PRACTICE_FORM));
    }
}

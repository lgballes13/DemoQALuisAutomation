package com.luisautomation.tasks;

import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsNotFoundLink implements Task {

    public static SelectsNotFoundLink option(){
        return Tasks.instrumented(SelectsNotFoundLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinksPage.LINK_NOT_FOUND));
    }
}

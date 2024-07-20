package com.luisautomation.tasks;

import com.luisautomation.interactions.SwitchHomePage;
import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsCreatedLink implements Task {

    public static SelectsCreatedLink option(){
        return Tasks.instrumented(SelectsCreatedLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SwitchHomePage.tab(0),
                Click.on(LinksPage.LINK_CREATED));
    }
}

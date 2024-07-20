package com.luisautomation.tasks;

import com.luisautomation.interactions.SwitchHomePage;
import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsDynamicLink implements Task {

    public static SelectsDynamicLink option(){
        return Tasks.instrumented(SelectsDynamicLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SwitchHomePage.tab(0),Click.on(LinksPage.LINK_HOME_DYNAMIC),
                SwitchHomePage.tab(1));
    }
}

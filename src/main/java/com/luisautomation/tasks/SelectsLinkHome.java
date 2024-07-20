package com.luisautomation.tasks;

import com.luisautomation.interactions.SwitchHomePage;
import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SelectsLinkHome implements Task {

    public static SelectsLinkHome option(){
        return Tasks.instrumented(SelectsLinkHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinksPage.LINK_HOME),
                SwitchHomePage.tab(1));


    }
}

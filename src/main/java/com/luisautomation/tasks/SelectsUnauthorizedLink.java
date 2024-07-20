package com.luisautomation.tasks;

import com.luisautomation.userinterface.LinksPage;
import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class SelectsUnauthorizedLink implements Task {

    public static SelectsUnauthorizedLink option(){
        return Tasks.instrumented(SelectsUnauthorizedLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Hit.the(Keys.PAGE_DOWN).into(TextBoxPage.BODY),Click.on(LinksPage.LINK_UNAUTHORIZED));
    }
}

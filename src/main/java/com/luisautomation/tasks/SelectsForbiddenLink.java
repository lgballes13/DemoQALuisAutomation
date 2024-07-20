package com.luisautomation.tasks;

import com.luisautomation.userinterface.LinksPage;
import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class SelectsForbiddenLink implements Task {

    public static SelectsForbiddenLink option(){
        return Tasks.instrumented(SelectsForbiddenLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Hit.the(Keys.PAGE_DOWN).into(TextBoxPage.BODY),Click.on(LinksPage.LINK_FORBIDDEN));
    }
}

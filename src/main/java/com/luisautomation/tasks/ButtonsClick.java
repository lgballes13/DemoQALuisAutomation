package com.luisautomation.tasks;

import com.luisautomation.interactions.RightClick;
import com.luisautomation.userinterface.ButtonsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.DoubleClickOnBy;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.internal.MouseAction;

public class ButtonsClick implements Task {

    public static ButtonsClick option(){
        return Tasks.instrumented(ButtonsClick.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DoubleClick.on(ButtonsPage.BTN_DOUBLE_CLICK),
                RightClick.on(ButtonsPage.BTN_RIGHT_CLICK),
                Click.on(ButtonsPage.BTN_CLICK)
                );
    }
}

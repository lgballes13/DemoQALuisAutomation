package com.luisautomation.interactions;

import com.luisautomation.userinterface.CheckBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsCheckBox implements Task {


    public static SelectsCheckBox option (){
        return Tasks.instrumented(SelectsCheckBox.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckBoxPage.BTN_CHECK_BOX),
                Click.on(CheckBoxPage.BTN_HOME));
    }
}

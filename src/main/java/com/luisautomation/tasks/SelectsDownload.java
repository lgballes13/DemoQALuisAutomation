package com.luisautomation.tasks;

import com.luisautomation.userinterface.UpDownPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectsDownload implements Task {

    public static SelectsDownload fileOption(){
        return Tasks.instrumented(SelectsDownload.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(UpDownPage.BTN_DOWNLOAD));
    }
}

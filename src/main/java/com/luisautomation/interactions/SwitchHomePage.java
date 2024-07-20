package com.luisautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchHomePage implements Interaction {

    private int tab;

    public SwitchHomePage (int tab){
        this.tab = tab;
    }


    public static SwitchHomePage tab(int tab){
        return Tasks.instrumented(SwitchHomePage.class, tab);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        actor.attemptsTo(Switch.toWindow(tabs.get(tab)));
    }
}

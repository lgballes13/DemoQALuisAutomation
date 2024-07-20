package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {



    public static final Target BTN_ELEMENTS = Target.the("Boton option elements").located(By.xpath("//h5[text()='Elements']"));
    public static final Target BTN_ALERTS = Target.the("Boton option Alerts, Frame & Windows").located(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

    public static final Target BTN_FORMS = Target.the("Boton option forms").located(By.xpath("//h5[text()='Forms']"));






}


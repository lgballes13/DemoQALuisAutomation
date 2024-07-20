package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButtonPage {


    public static final Target BTN_RADIO_BUTTON = Target.the("button radio").located(By.xpath("//span[text()='Radio Button']"));

    public static final Target RADIO_YES_OPTION = Target.the("radio option yes").located(By.xpath("//label[@for='yesRadio']"));

    public static final Target RADIO_IMPRESSIVE_OPTION = Target.the("radio option impressive").located(By.xpath("//label[@for='impressiveRadio']"));

    public static final Target SPN_YES = Target.the("span yes").located(By.xpath("//span[text()='Yes']"));

    public static final Target SPN_IMPRESSIVE = Target.the("span impressive").located(By.xpath("//span[text()='Impressive']"));







}

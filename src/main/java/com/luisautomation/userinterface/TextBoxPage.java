package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextBoxPage {


    public static final Target BTN_TEXT_BOX = Target.the("Button option text box").located(By.xpath("//span[text()='Text Box']"));

    public static final Target BODY = Target.the("body").located(By.xpath("//body"));

    public static final Target TXT_FULL_NAME = Target.the("text full name").located(By.id("userName"));

    public static final Target TXT_EMAIL = Target.the("text email").located(By.id("userEmail"));

    public static final Target TXT_CURRENT_ADDRESS = Target.the("text current address").located(By.id("currentAddress"));

    public static final Target TXT_PERMANENT_ADDRESS = Target.the("text permanent address").located(By.id("permanentAddress"));
    public static final Target BTN_SUBMIT = Target.the("Button submit").located(By.id("submit"));

    public static final Target P_NAME = Target.the("p name").located(By.id("name"));

    public static final Target P_EMAIL = Target.the("p email").located(By.id("email"));

    public static final Target P_CURRENT_ADDRESS = Target.the("p current address").located(By.xpath("//p[@id='currentAddress']"));

    public static final Target P_PERMANENT_ADDRESS = Target.the("p permanent address").located(By.xpath("//p[@id='permanentAddress']"));





}

package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonsPage {


    public static final Target BTN_BUTTONS = Target.the("Button option buttons").located(By.xpath("//span[text()='Buttons']"));


    public static final Target BTN_DOUBLE_CLICK = Target.the("Button double click").located(By.xpath("//button[@id='doubleClickBtn']"));
    public static final Target BTN_RIGHT_CLICK = Target.the("Button right click").located(By.xpath("//button[@id='rightClickBtn']"));
    public static final Target BTN_CLICK = Target.the("Button Clickme").located(By.xpath("//button[text()='Click Me']"));



    public static final Target MSG_DOUBLE_CLICK = Target.the("message double click").located(By.xpath("//p[@id='doubleClickMessage']"));
    public static final Target MSG_RIGHT_CLICK = Target.the("message right click").located(By.xpath("//p[@id='rightClickMessage']"));
    public static final Target MSG_CLICK= Target.the("message Clickme").located(By.xpath("//p[@id='dynamicClickMessage']"));












}

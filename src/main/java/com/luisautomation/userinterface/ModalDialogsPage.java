package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalDialogsPage {

    public static final Target BTN_MODAL_DAILOGS = Target.the("Button option modal dialogs").located(By.xpath("//span[text()='Modal Dialogs']"));
    public static final Target BTN_MODAL_SMALL = Target.the("Button option modal small").located(By.xpath("//button[@id='showSmallModal']"));
    public static final Target BTN_CLOSE_SMALL = Target.the("Button close modal small").located(By.xpath("//button[@id='closeSmallModal']"));
    public static final Target BTN_MODAL_LARGE = Target.the("Button option modal large").located(By.xpath("//button[@id='showLargeModal']"));
    public static final Target LBL_MODAL_SMALL = Target.the("label option modal small").located(By.xpath("//div[text()='Small Modal']"));
    public static final Target LBL_MODAL_LARGE = Target.the("label option modal large").located(By.xpath("//div[text()='Large Modal']"));



}

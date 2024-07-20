package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckBoxPage {

    public static final Target BTN_CHECK_BOX = Target.the("Button option check box").located(By.xpath("//span[text()='Check Box']"));

    public static final Target BTN_HOME = Target.the("button home").located(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));

    public static final Target BTN_DESKTOP = Target.the("button desktop ").located(By.xpath("(//input[@id='tree-node-desktop']//parent::label//preceding::button[@class='rct-collapse rct-collapse-btn'])[2]"));

    public static final Target LBL_NOTES = Target.the("label notes").located(By.xpath("//label[@for='tree-node-notes']"));

    public static final Target LBL_DOCUMENTS = Target.the("label documents").located(By.xpath("//label[@for='tree-node-documents']"));

    public static final Target BTN_DOWNLOADS = Target.the("button downloads ").located(By.xpath("(//input[@id='tree-node-downloads']//parent::label//preceding::button[@class='rct-collapse rct-collapse-btn'])[4]"));

    public static final Target LBL_WORD_FILE = Target.the("label documents").located(By.xpath("//label[@for='tree-node-wordFile']"));

    public static final Target SPN_NOTES = Target.the("span notes").located(By.xpath("//span[text()='notes']"));

    public static final Target SPN_WORKSPACE = Target.the("span workspace").located(By.xpath("//span[text()='workspace']"));

    public static final Target SPN_OFFICE= Target.the("span office").located(By.xpath("//span[text()='office']"));

    public static final Target SPN_WORD_FILE = Target.the("span wordFile").located(By.xpath("//span[text()='wordFile']"));








}

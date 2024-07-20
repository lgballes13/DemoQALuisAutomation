package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpDownPage {


    public static final Target BTN_UP_DOWN = Target.the("Button option upload and download").located(By.xpath("//span[text()='Upload and Download']"));
    public static final Target BTN_DOWNLOAD = Target.the("button download").locatedBy("//a[@id='downloadButton']");
    public static final Target BTN_UPLOAD = Target.the("button upload").locatedBy("//input[@id='uploadFile']");
    public static final Target LBL_UPLOAD_PATH = Target.the("lbl path").locatedBy("//p[@id='uploadedFilePath']");

}

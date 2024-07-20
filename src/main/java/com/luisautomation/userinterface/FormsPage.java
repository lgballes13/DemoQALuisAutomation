package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsPage {

    public static final Target BTN_PRACTICE_FORM = Target.the("Button option practice form").located(By.xpath("//span[text()='Practice Form']"));
    public static final Target TXT_FIRST_NAME = Target.the("input first name").locatedBy("//input[@id='firstName']");
    public static final Target TXT_LAST_NAME = Target.the("input last name").locatedBy("//input[@id='lastName']");
    public static final Target TXT_EMAIL = Target.the("input email").locatedBy("//input[@id='userEmail']");
    public static final Target RAD_GENDER = Target.the("radio gender").locatedBy("//label[text()='{0}']");
    public static final Target TXT_MOBILE = Target.the("input mobile").locatedBy("//input[@id='userNumber']");
    public static final Target TXT_DATE_BIRTH = Target.the("input mobile").locatedBy("//input[@id='dateOfBirthInput']");
    public static final Target LBL_HOBBIES = Target.the("label hobbies").locatedBy("//label[text()='{0}']");

    public static final Target BTN_UPLOAD_PICTURE = Target.the("button upload picture").locatedBy("//input[@id='uploadPicture']");
    public static final Target TXT_ADDRESS = Target.the("text current address").locatedBy("//textarea[@id='currentAddress']");
    public static final Target LIST_STATE = Target.the("list states").locatedBy("//div[@id='state']");
    public static final Target LIST_CITY = Target.the("list cities").locatedBy("//div[@id='city']");












}

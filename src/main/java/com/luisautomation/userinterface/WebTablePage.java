package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablePage {


    public static final Target BTN_WEB_TABLE = Target.the("Button option web table").located(By.xpath("//span[text()='Web Tables']"));
    public static final Target BTN_ADD = Target.the("Button add for register new user").located(By.xpath("//button[text()='Add']"));
    public static final Target TXT_FIRST_NAME = Target.the("input first name").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target TXT_LAST_NAME = Target.the("input last name").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target TXT_EMAIL = Target.the("input email").located(By.xpath("//input[@placeholder='name@example.com']"));
    public static final Target TXT_AGE = Target.the("input age").located(By.xpath("//input[@placeholder='Age']"));
    public static final Target TXT_SALARY = Target.the("input salary").located(By.xpath("//input[@placeholder='Salary']"));
    public static final Target TXT_DEPARTAMENT = Target.the("input departament").located(By.xpath("//input[@placeholder='Department']"));
    public static final Target BTN_SUBMIT = Target.the("button submit").located(By.xpath("//button[text()='Submit']"));
    public static final Target LBL_VALUE = Target.the("label vale ").locatedBy("//div[text()='{0}']");
    public static final Target BTN_EDIT = Target.the("button edit register").locatedBy("//span[@id='edit-record-4']");
    public static final Target BTN_DELETE = Target.the("button delete register").locatedBy("//span[@id='delete-record-4']");


}

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
    public static final Target BTN_MONTH = Target.the("button month").locatedBy("//select[@class='react-datepicker__month-select']");
    public static final Target BTN_YEAR = Target.the("button year").locatedBy("//select[@class='react-datepicker__year-select']");
    public static final Target BTN_DAY = Target.the("button day").locatedBy("//div[text()='{0}']");
    public static final Target LIST_MONTH = Target.the("list of month").locatedBy("//option[text()='{0}']");
    public static final Target LIST_YEAR = Target.the("list of year").locatedBy("//option[text()='{0}']");
    public static final Target TXT_DATE_BIRTH = Target.the("input mobile").locatedBy("//input[@id='dateOfBirthInput']");
    public static final Target BTN_SUBJECT= Target.the("input subject").locatedBy("//div[@id='subjectsContainer']");
    public static final Target TXT_SUBJECT= Target.the("input subject").locatedBy("//div[@class='subjects-auto-complete__input']");
    public static final Target LBL_HOBBIES = Target.the("label hobbies").locatedBy("//label[text()='{0}']");



    public static final Target BTN_UPLOAD_PICTURE = Target.the("button upload picture").locatedBy("//input[@id='uploadPicture']");
    public static final Target TXT_ADDRESS = Target.the("text current address").locatedBy("//textarea[@id='currentAddress']");
    public static final Target BTN_LIST_STATE = Target.the("button list states").locatedBy("//div[@id='state']");
    public static final Target LIST_STATE = Target.the("button list states").locatedBy("//div[text()='{0}']");
    public static final Target BTN_LIST_CITY = Target.the("button list cities").locatedBy("//div[@id='city']");
    public static final Target LIST_CITY = Target.the("button list cities").locatedBy("//div[text()='{0}']");
    public static final Target BTN_SUBMIT = Target.the("button submit").locatedBy("//button[@id='submit']");

    public static final Target VALUE_STUDENT_NAME = Target.the("value label student name").locatedBy("//td[text()='Student Name']//following-sibling::td");
    public static final Target VALUE_STUDENT_EMAIL = Target.the("value label student email").locatedBy("//td[text()='Student Email']//following-sibling::td");
    public static final Target VALUE_GENDER = Target.the("value label gender").locatedBy("//td[text()='Gender']//following-sibling::td");
    public static final Target VALUE_MOBILE = Target.the("value label mobile").locatedBy("//td[text()='Mobile']//following-sibling::td");
    public static final Target VALUE_DATE_BIRTH = Target.the("value label date of birth").locatedBy("//td[text()='Date of Birth']//following-sibling::td");
    public static final Target VALUE_SUBJECTS = Target.the("value label subjects").locatedBy("//td[text()='Subjects']//following-sibling::td");
    public static final Target VALUE_HOBBIES = Target.the("value label hobbies").locatedBy("//td[text()='Hobbies']//following-sibling::td");
    public static final Target VALUE_ADDRESS = Target.the("value label address").locatedBy("//td[text()='Address']//following-sibling::td");

    public static final Target VALUE_STATE = Target.the("value label state and city").locatedBy("//td[text()='State and City']//following-sibling::td");














}

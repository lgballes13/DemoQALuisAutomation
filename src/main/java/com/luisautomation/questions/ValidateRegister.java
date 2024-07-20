package com.luisautomation.questions;

import com.luisautomation.userinterface.TextBoxPage;
import com.luisautomation.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Question;

public class ValidateRegister {


    public static Question<String> firstName(String firstName){
        return actor -> WebTablePage.LBL_VALUE.of(firstName).resolveFor(actor).getText();
    }

    public static Question<String> lastName(String lastName){
        return actor -> WebTablePage.LBL_VALUE.of(lastName).resolveFor(actor).getText();
    }

    public static Question<String> email(String email){
        return actor -> WebTablePage.LBL_VALUE.of(email).resolveFor(actor).getText();
    }

    public static Question<String> age(String age){
        return actor -> WebTablePage.LBL_VALUE.of(age).resolveFor(actor).getText();
    }

    public static Question<String> salary(String salary){
        return actor -> WebTablePage.LBL_VALUE.of(salary).resolveFor(actor).getText();
    }

    public static Question<String> department(String department){
        return actor -> WebTablePage.LBL_VALUE.of(department).resolveFor(actor).getText();
    }






}

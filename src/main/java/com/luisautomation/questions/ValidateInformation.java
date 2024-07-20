package com.luisautomation.questions;

import com.luisautomation.userinterface.CheckBoxPage;
import com.luisautomation.userinterface.FormsPage;
import net.serenitybdd.screenplay.Question;

public class ValidateInformation {


    public static Question<String> firstName(){
        return actor -> FormsPage.VALUE_STUDENT_NAME.resolveFor(actor).getText();
    }

    public static Question<String> lastName(){
        return actor -> FormsPage.VALUE_STUDENT_NAME.resolveFor(actor).getText();
    }


    public static Question<String> email(){
        return actor -> FormsPage.VALUE_STUDENT_EMAIL.resolveFor(actor).getText();
    }

    public static Question<String> gender(){
        return actor -> FormsPage.VALUE_GENDER.resolveFor(actor).getText();
    }

    public static Question<String> mobile(){
        return actor -> FormsPage.VALUE_MOBILE.resolveFor(actor).getText();
    }

    public static Question<String> day(){
        return actor -> FormsPage.VALUE_DATE_BIRTH.resolveFor(actor).getText();
    }

    public static Question<String> mont(){
        return actor -> FormsPage.VALUE_DATE_BIRTH.resolveFor(actor).getText();
    }

    public static Question<String> year(){
        return actor -> FormsPage.VALUE_DATE_BIRTH.resolveFor(actor).getText();
    }

    public static Question<String> hobbies(){
        return actor -> FormsPage.VALUE_HOBBIES.resolveFor(actor).getText();
    }


    public static Question<String> address(){
        return actor -> FormsPage.VALUE_ADDRESS.resolveFor(actor).getText();
    }

    public static Question<String> state(){
        return actor -> FormsPage.VALUE_STATE.resolveFor(actor).getText();
    }

    public static Question<String> city(){
        return actor -> FormsPage.VALUE_STATE.resolveFor(actor).getText();
    }

}

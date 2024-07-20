package com.luisautomation.questions;

import com.luisautomation.userinterface.CheckBoxPage;
import com.luisautomation.userinterface.RadioButtonPage;
import net.serenitybdd.screenplay.Question;

public class ValidateRadioButton {

    public static Question<String> yes(){
        return actor -> RadioButtonPage.SPN_YES.resolveFor(actor).getText();
    }

    public static Question<String> impressive(){
        return actor -> RadioButtonPage.SPN_IMPRESSIVE.resolveFor(actor).getText();
    }
}

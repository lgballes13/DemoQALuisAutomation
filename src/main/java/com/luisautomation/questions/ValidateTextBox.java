package com.luisautomation.questions;

import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.screenplay.Question;

public class ValidateTextBox {

    public static Question<String> name(){
        return actor -> TextBoxPage.P_NAME.resolveFor(actor).getText();
    }

    public static Question<String> email(){
        return actor -> TextBoxPage.P_EMAIL.resolveFor(actor).getText();
    }

    public static Question<String> currentAddress(){
        return actor -> TextBoxPage.P_CURRENT_ADDRESS.resolveFor(actor).getText();
    }

    public static Question<String> permanentAddress(){
        return actor -> TextBoxPage.P_PERMANENT_ADDRESS.resolveFor(actor).getText();
    }

}

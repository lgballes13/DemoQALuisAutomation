package com.luisautomation.questions;

import com.luisautomation.userinterface.CheckBoxPage;
import com.luisautomation.userinterface.TextBoxPage;
import net.serenitybdd.screenplay.Question;

public class ValidateCheckBox {

    public static Question<String> notes(){
        return actor -> CheckBoxPage.SPN_NOTES.resolveFor(actor).getText();
    }

    public static Question<String> workspace(){
        return actor -> CheckBoxPage.SPN_WORKSPACE.resolveFor(actor).getText();
    }

    public static Question<String> office(){
        return actor -> CheckBoxPage.SPN_OFFICE.resolveFor(actor).getText();
    }

    public static Question<String> wordFile(){
        return actor -> CheckBoxPage.SPN_WORD_FILE.resolveFor(actor).getText();
    }
}

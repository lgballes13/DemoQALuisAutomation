package com.luisautomation.questions;

import com.luisautomation.userinterface.ButtonsPage;
import com.luisautomation.userinterface.CheckBoxPage;
import net.serenitybdd.screenplay.Question;

public class ValidateButtton {


    public static Question<Boolean> doubleClick(){
        return actor -> ButtonsPage.MSG_DOUBLE_CLICK.resolveFor(actor).isPresent();
    }

    public static Question<Boolean> rightClick(){
        return actor -> ButtonsPage.MSG_RIGHT_CLICK.resolveFor(actor).isPresent();
    }

    public static Question<Boolean> meClick(){
        return actor -> ButtonsPage.MSG_CLICK.resolveFor(actor).isPresent();
    }


}

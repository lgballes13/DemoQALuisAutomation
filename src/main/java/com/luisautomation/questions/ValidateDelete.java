package com.luisautomation.questions;

import com.luisautomation.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDelete implements Question<Boolean> {



    public static ValidateDelete ofRegister(){
        return new ValidateDelete();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        if (WebTablePage.BTN_DELETE.resolveFor(actor).isPresent()){
            return false;
        }else{
            return true;
        }

    }
}

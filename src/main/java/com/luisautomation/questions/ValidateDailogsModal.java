package com.luisautomation.questions;

import com.luisautomation.userinterface.ButtonsPage;
import com.luisautomation.userinterface.ModalDialogsPage;
import net.serenitybdd.screenplay.Question;

public class ValidateDailogsModal {

    public static Question<Boolean> small(){
        return actor -> ModalDialogsPage.LBL_MODAL_SMALL.resolveFor(actor).isPresent();
    }


    public static Question<Boolean> large(){
        return actor -> ModalDialogsPage.LBL_MODAL_LARGE.resolveFor(actor).isPresent();
    }

}

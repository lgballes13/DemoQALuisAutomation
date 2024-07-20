package com.luisautomation.questions;

import com.luisautomation.userinterface.ButtonsPage;
import com.luisautomation.userinterface.UpDownPage;
import net.serenitybdd.screenplay.Question;

public class ValidateUpDown {

    public static Question<Boolean> fileUpload(){
        return actor -> UpDownPage.LBL_UPLOAD_PATH.resolveFor(actor).isPresent();
    }

}

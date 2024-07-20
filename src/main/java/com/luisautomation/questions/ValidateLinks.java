package com.luisautomation.questions;

import com.luisautomation.interactions.SwitchHomePage;
import com.luisautomation.userinterface.ButtonsPage;
import com.luisautomation.userinterface.CheckBoxPage;
import com.luisautomation.userinterface.LinksPage;
import net.serenitybdd.screenplay.Question;

public class ValidateLinks {

    public static Question<Boolean> home(){
        return actor -> LinksPage.MSG_HOME.resolveFor(actor).isPresent();

    }

    public static Question<String> created(){
        return actor -> LinksPage.MSG_CREATED.resolveFor(actor).getText();
    }

    public static Question<String> noContent(){
        return actor -> LinksPage.MSG_NO_CONTENT.resolveFor(actor).getText();
    }

    public static Question<String> moved(){
        return actor -> LinksPage.MSG_MOVED.resolveFor(actor).getText();
    }

    public static Question<String> badRequest(){
        return actor -> LinksPage.MSG_BAD_REQUEST.resolveFor(actor).getText();
    }

    public static Question<String> unauthorized(){
        return actor -> LinksPage.MSG_UNAUTHORIZED.resolveFor(actor).getText();
    }

    public static Question<String> forbidden(){
        return actor -> LinksPage.MSG_FORBIDDEN.resolveFor(actor).getText();
    }

    public static Question<String> notFound(){
        return actor -> LinksPage.MSG_NOT_FOUND.resolveFor(actor).getText();
    }


}

package com.luisautomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LinksPage {

    public static final Target BTN_LINKS = Target.the("Button option Links").located(By.xpath("//span[text()='Links']"));
    public static final Target LINK_HOME = Target.the("link home").located(By.xpath("//a[@id='simpleLink']"));
    public static final Target LINK_HOME_DYNAMIC = Target.the("link home dynamic").located(By.xpath("//a[@id='dynamicLink']"));
    public static final Target LINK_CREATED = Target.the("link created").located(By.xpath("//a[@id='created']"));
    public static final Target LINK_NO_CONTENT = Target.the("link no content").located(By.xpath("//a[@id='no-content']"));
    public static final Target LINK_MOVED = Target.the("link moved").located(By.xpath("//a[@id='moved']"));
    public static final Target LINK_BAD_REQUEST = Target.the("link bad request").located(By.xpath("//a[@id='bad-request']"));
    public static final Target LINK_UNAUTHORIZED = Target.the("link unauthorized").located(By.xpath("//a[@id='unauthorized']"));
    public static final Target LINK_FORBIDDEN = Target.the("link forbidden").located(By.xpath("//a[@id='forbidden']"));
    public static final Target LINK_NOT_FOUND = Target.the("link not found").located(By.xpath("//a[@id='invalid-url']"));
    public static final Target MSG_HOME = Target.the("message home").located(By.xpath("//h5[text()='Elements']"));
    public static final Target MSG_CREATED = Target.the("message created").locatedBy("//b[text()='Created']");
    public static final Target MSG_NO_CONTENT = Target.the("message no content").locatedBy("//b[text()='No Content']");
    public static final Target MSG_MOVED = Target.the("message moved").locatedBy("//b[text()='Moved Permanently']");
    public static final Target MSG_BAD_REQUEST = Target.the("message bad request").locatedBy("//b[text()='Bad Request']");
    public static final Target MSG_UNAUTHORIZED = Target.the("message unauthorized").locatedBy("//b[text()='Unauthorized']");
    public static final Target MSG_FORBIDDEN = Target.the("message forbidden").locatedBy("//b[text()='Forbidden']");
    public static final Target MSG_NOT_FOUND = Target.the("message not found").locatedBy("//b[text()='Not Found']");


}

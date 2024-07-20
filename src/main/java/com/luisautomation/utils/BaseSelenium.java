package com.luisautomation.utils;

import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BaseSelenium {


    private WebDriver driver;


    public BaseSelenium (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection (){
        DesiredCapabilities caps = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public Performable visit (String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return null;
    }



}

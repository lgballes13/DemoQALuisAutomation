package com.luisautomation.tasks;

import com.luisautomation.userinterface.UpDownPage;
import com.luisautomation.utils.CsvGenerator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Paths;

public class UploadFile implements Task {


    public static UploadFile csv(){
        return Tasks.instrumented(UploadFile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String filePath = "C:/Users/PC/Downloads/serenitybdd-appium-poc-master/DemoQAjuju/file.csv";
        CsvGenerator.generateCsvFile();
        actor.attemptsTo(Upload.theFile(Paths.get(filePath)).to(UpDownPage.BTN_UPLOAD
        ));
    }
}

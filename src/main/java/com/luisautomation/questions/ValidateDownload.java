package com.luisautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ValidateDownload implements Question<Boolean> {

    private final String fileName;

    public ValidateDownload(String fileName) {
        this.fileName = fileName;
    }

    public static ValidateDownload exists(String fileName) {
        return new ValidateDownload(fileName);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String userDir = System.getProperty("user.dir");

        Path currentPath = Paths.get(userDir);

        // Obtener el nombre del directorio actual
        String currentDirectory = currentPath.getFileName().toString();

        // Obtener la ruta padre del directorio actual
        Path parentPath = currentPath.getParent();

        // Obtener la ruta que contiene "Downloads"
        Path downloadsPath = parentPath.getParent();

        File file = new File(downloadsPath + "/"+fileName);
        System.out.println("RRRR"+ file);
        return file.exists();
    }
}

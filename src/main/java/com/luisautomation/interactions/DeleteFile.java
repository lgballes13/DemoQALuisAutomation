package com.luisautomation.interactions;

import com.luisautomation.tasks.DeleteInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile implements Interaction {

    public static DeleteFile downloaded(){
        return Tasks.instrumented(DeleteFile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String userDir = System.getProperty("user.dir");

        Path currentPath = Paths.get(userDir);

        String currentDirectory = currentPath.getFileName().toString();

        Path parentPath = currentPath.getParent();

        Path downloadsPath = parentPath.getParent();

        File file = new File(downloadsPath + "/"+"sampleFile.jpeg");


        if (file.exists()) {
            if (file.delete()) {
                System.out.println("El archivo ha sido eliminado: " + file);
            } else {
                System.out.println("El archivo no se pudo eliminar: " + file);
            }
        } else {
            System.out.println("El archivo no existe: " + file);
        }
    }

}

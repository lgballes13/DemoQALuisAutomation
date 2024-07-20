package com.luisautomation.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CsvGenerator {

    public static void generateCsvFile() {
        String[] headers = {"Title1", "Title2", "Title3", "Title4"};
        Random random = new Random();

        try (FileWriter writer = new FileWriter("C:\\Users\\PC\\Downloads\\serenitybdd-appium-poc-master\\DemoQAjuju\\file.csv")) {
            for (String header : headers) {
                writer.append(header).append(",");
            }
            writer.append("\n");

            for (int i = 0; i < 5; i++) {
                writer.append("Value1").append(",")
                        .append("Value2").append(",")
                        .append("Value3").append(",")
                        .append("DynamicValue" + random.nextInt(100)).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

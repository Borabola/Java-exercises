package com.example.caliibrateLines;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CalibrateLines {
    public List<Integer> calibrateLines(String filePath) {
        Path filePathReceived = Paths.get(filePath);
        List<Integer> calibrationValues = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(filePathReceived);
            for (String line : lines) {
                //System.out.println("lines" + line);
                line = line.trim();
                if (!line.isEmpty()) {

                    char firstChar = line.charAt(0);
                    System.out.println("firstChar" + firstChar);
                    char lastChar = line.charAt(line.length() - 1);
                    if (Character.isDigit(firstChar) && Character.isDigit(lastChar)) {

                        int calibrationValue = Integer.parseInt("" + firstChar + lastChar);
                        calibrationValues.add(calibrationValue);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return calibrationValues;
    }

    public int calckSum (List<Integer> calibrationValues) {
        int sum = 0;
        for (int value : calibrationValues) {
            sum += value;
        }

        return sum;
    }
}

package com.example.caliibrateLines;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class CalibrateLines {

    // we tell the method that it's OK th throw an IOException in case of issues, the caller will handle this
    public List<Integer> calibrateLines(String filePath) throws IOException {

        // use newer java feature Path.of (not working with java 8)
        Path filePathReceived = Path.of(filePath);
        List<Integer> calibrationValues = new ArrayList<>();

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

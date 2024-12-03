package com.example.caliibrateLines;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class CalibrateLines {
    // we tell the method that it's OK th throw an IOException in case of issues, the caller will handle this
    public int calibrateLines(String filePath) throws IOException {

        // use newer java feature Path.of (not working with java 8)
        Path filePathReceived = Path.of(filePath);
        List<Integer> calibrationValues = new ArrayList<>();
        int sum = 0;

        List<String> lines = Files.readAllLines(filePathReceived);
        for (String line : lines) {
            if (!line.isEmpty()) {
                List<String> numberList = new ArrayList<>();
                int currentLineNumber;
                String[] numberText = line.trim().split("\\D");

                for (String element : numberText) {
                    if (!element.isEmpty()) {
                        for (char digit : element.toCharArray()) {
                            numberList.add(String.valueOf(digit));
                        }
                    }
                }
                 try {
                    currentLineNumber = Integer.parseInt(numberList.get(0) + numberList.get(numberList.toArray().length - 1));
                    calibrationValues.add(currentLineNumber);
                    sum += currentLineNumber;
                    System.out.println("currentLineNumber " + currentLineNumber);
                } catch (NumberFormatException e) {
                    // smooth error display
                    System.out.println("\nError: " + e.getClass() + ": " + e.getMessage() + "\n");
                    // make sure to exit with a non-zero return code
                    System.exit(1);
                }
            }
        }

        System.out.println("total sum :" + sum);
        System.out.println("calibrationValues: " + calibrationValues);
        return sum;
    }
}

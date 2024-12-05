package com.example.safeReports;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class SafeReports {
    public static boolean isMonotonicWithValidDifference(List<Integer> report) {

        boolean isIncreasing = report.get(1) > report.get(0);
        for (int i = 1; i < report.size(); i++) {
            int diff = report.get(i) - report.get(i - 1);

            // Check monotonicity
            if ((isIncreasing && diff <= 0) || (!isIncreasing && diff >= 0)) {
                return false;
            }

            // Check difference range
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }
        }
        return true;
    }

    public int CalkSafeReports(String filePath) throws IOException {
        // use newer java feature Path.of (not working with java 8)
        Path filePathReceived = Path.of(filePath);


        int sum = 0;

        List<String> lines = Files.readAllLines(filePathReceived);
        for (String line : lines) {
            if (!line.isEmpty()) {
                // Convert the string to a List<Integer>
                List<Integer> report = Arrays.stream(line.split(" "))   // //or use split("\\s+")
                        .map(Integer::parseInt) // Convert each substring to an Integer
                        .toList();

                boolean isValid = isMonotonicWithValidDifference(report);
                if (isValid)  {
                    sum++;
                }
            }
        }
        //System.out.println("Qnt of safe reports" + sum);
        return sum;
    }
}

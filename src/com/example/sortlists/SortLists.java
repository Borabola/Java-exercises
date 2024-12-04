package com.example.sortlists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortLists {
    public int AddDiff(String filePath) throws IOException {
        // use newer java feature Path.of (not working with java 8)
        Path filePathReceived = Path.of(filePath);

        List<Integer> leftColumn = new ArrayList<>();
        List<Integer> rightColumn = new ArrayList<>();
        int sum = 0;

        List<String> lines = Files.readAllLines(filePathReceived);
        for (String line : lines) {
            if (!line.isEmpty()) {
                String[] parts = line.split("\\s+"); // Split by whitespace
                if (parts.length == 2) {

                    leftColumn.add(Integer.parseInt(parts[0]));
                    rightColumn.add(Integer.parseInt(parts[1]));
                }
            }

        }
        if  (!leftColumn.isEmpty()) {
            // Sort both columns
            Collections.sort(leftColumn);
            Collections.sort(rightColumn);

            for (int i = 0; i < leftColumn.size(); i++) {
//                System.out.println("i " + i);
//                System.out.println("Left " + (leftColumn.get(i) + "Right " + rightColumn.get(i)));
//                System.out.println("Diff " + (leftColumn.get(i) - rightColumn.get(i)));
                sum += Math.abs(leftColumn.get(i) - rightColumn.get(i));
//                System.out.println("Sum " + sum);
            }
        }

        System.out.println("Sum " + sum);
        return sum;
    }
}

package com.example.sortlists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class SortLists {
    List<Integer> leftColumn = new ArrayList<>();
    List<Integer> rightColumn = new ArrayList<>();

    public int AddDiff(String filePath) throws IOException {
        // use newer java feature Path.of (not working with java 8)
        Path filePathReceived = Path.of(filePath);


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

    public int calculateWeightedSum() {
        int sum2 = 0;

        // Count occurrences of elements in rightColumn
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : rightColumn) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Calculate the weighted sum
        for (int num : leftColumn) {
            int count = frequencyMap.getOrDefault(num, 0);
            sum2 += num * count;
        }
        System.out.println("Sum 2" + sum2);
        return sum2;
    }
}

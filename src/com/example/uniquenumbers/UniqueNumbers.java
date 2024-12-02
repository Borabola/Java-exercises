package com.example.uniquenumbers;

public class UniqueNumbers {
    public void printUniqueNumbers() {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println("" + i + j + k);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of unique numbers: " + count);
    }
}

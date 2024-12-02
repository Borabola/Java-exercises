package com.example.reverseWords;

public class ReverseWords {
    public String reverseWords(String str) {
        String[] words = str.split(" ");

        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
}

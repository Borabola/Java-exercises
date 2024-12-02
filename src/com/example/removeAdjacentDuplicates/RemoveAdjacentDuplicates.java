package com.example.removeAdjacentDuplicates;

public class RemoveAdjacentDuplicates {
    String resultString;

    public String removeAdjacentDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String result = "";
        boolean hasDuplicates = false;

        int i = 0;
        while (i < str.length()) {
            int j = i + 1;

            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                j++;
                hasDuplicates = true;
            }

            if (j == i + 1) {
                result += str.charAt(i);
            }

            i = j;
        }

        if (!hasDuplicates) {
            return result;
        }

        return removeAdjacentDuplicates(result);
    }

//    public void printResult() {
//        System.out.println(resultString);
//    }
}

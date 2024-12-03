package com.example.main;
import java.io.File;
import java.io.IOException;
import java.util.List;
//import com.example.multiple.Multiple;
//import com.example.helloworld.HelloWorld;
//import com.example.uniquenumbers.UniqueNumbers;
//import com.example.removeAdjacentDuplicates.RemoveAdjacentDuplicates;
//import com.example.reverseWords.ReverseWords;
import com.example.caliibrateLines.CalibrateLines;

public class Main {
    public static void main(String[] args) {

//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.printHelloWorld();

//        Multiple multiple = new Multiple();
//        multiple.checkAndPrintResult();

//        UniqueNumbers uniqueNumbers = new UniqueNumbers();
//        uniqueNumbers.printUniqueNumbers();

        //exs 4
//        RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();
//        String result = removeAdjacentDuplicates.removeAdjacentDuplicates("aabaarbarccrabmq");
//        System.out.println("The new string after removing all adjacent duplicates is: " + result);


        //exs 5
//        ReverseWords reverseWords = new ReverseWords();
//
//        String result = reverseWords.reverseWords("Reverse words in a given string");
//        System.out.println("The new string after reversing the words is: " + result);

        //exs do the first day of this advent of code 2023

        CalibrateLines calibrateLines = new CalibrateLines();
        //String filePath2 ="https://adventofcode.com/2023/day/1"; initial data file

        // I added a new file for testing: src/resources/foo.txt
        // Using File.separator for win/unix style universal handling
        String filePath3 = "src" + File.separator + "resources" + File.separator + "foo.txt";

        int totalInt;

        // check exceptions here, calibrationValues will throw an exception in case of an issue
        try {
            totalInt = calibrateLines.calibrateLines(filePath3);
            System.out.println(totalInt);
        } catch (IOException e) {
            // smooth error display
            System.out.println("\nError: " + e.getClass() + ": " + e.getMessage() + "\n");
            // make sure to exit with a non-zero return code
            System.exit(1);
        }
    }
}

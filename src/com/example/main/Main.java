package com.example.main;
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
        String filePath = "https://drive.google.com/file/d/1AFw00LHoE_PpsagOFO06Y4qOuWd54bS1/view?usp=sharing";
        String filePath2 ="https://adventofcode.com/2023/day/1";
        String filePath3 = "/Users/melolun/Downloads/calibrationInput.rtf";
        List<Integer> calibrationValues = calibrateLines.calibrateLines(filePath3);
        for (int value : calibrationValues) {
            System.out.println(value);
        }

//        if (calibrationValues) {
//            System.out.println("The sum of all of the calibration values" + calibrateLines.calckSum(calibrationValues));
//        }
    }
}

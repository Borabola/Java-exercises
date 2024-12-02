package com.example.multiple;
import java.util.Scanner;

public class Multiple {
    public void checkAndPrintResult() {
        Scanner in = new Scanner(System.in);
        System.out.println("You a number: ");

        //String s = in.nextLine();
        int number = in.nextInt();
        System.out.println("You entered: " + number);

        boolean isMultiple = (number % 3 == 0) || (number % 7 == 0);

        System.out.println(isMultiple);
    }
}

package com.example.helloworld;

public class HelloWorld {
    int i = 6;
    int j = 7;
    int answer = i * j;
    float answer2 = (float)i / (float)j;

    String message = "Hello World";
    String stringAnswer = message + " " +  answer;
    String stringAnswer2 = message + " " +  answer2;

    //		boolean isMoreThanOne;
//
//		if (answer2 > 1) {
//			isMoreThanOne = true;
//		} else {
//			isMoreThanOne = false;
//		}

    //boolean isMoreThanOne = answer2 > 1 ? true : false;
    boolean isMoreThanOne = answer2 > 1;

    public void printHelloWorld() {
        System.out.println(message);
        System.out.println(stringAnswer);
        System.out.println(stringAnswer2 + " " + "is more than 1: " + isMoreThanOne);
    }
}

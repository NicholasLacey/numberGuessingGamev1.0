package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ynResponseStringType;
        Scanner userInput;
        userInput = new Scanner(System.in);
        System.out.println("do you want to start?(y/n?)");
        ynResponseStringType = userInput.next();
        while (!ynResponseStringType.equalsIgnoreCase("y") && !ynResponseStringType.equalsIgnoreCase("n"))
        if (ynResponseStringType.equalsIgnoreCase("y")) {
            System.out.println("great");
        }
        if (ynResponseStringType.equalsIgnoreCase("n")) {
            System.out.println("Goodbye then");
            System.exit(0);
        }
       int pickedNumber;
        pickedNumber = (int)(Math.random()*100);
        userInput.nextInt();
        if(userInput<=pickedNumber && >=){

        }
        System.out.println(pickedNumber);
    }
}

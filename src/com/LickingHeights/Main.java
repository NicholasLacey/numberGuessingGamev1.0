package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ynResponseStringType;
        Scanner userInput;
        userInput = new Scanner(System.in);
        int guessTries =4;
        int pickedNumber, uiNumber;
        boolean gameLoop = true;
        while (gameLoop) {
            System.out.println("do you want to play again?(y/n?)");
            ynResponseStringType = userInput.next();
            if (ynResponseStringType.equalsIgnoreCase("y")) {
                System.out.println("great");

            }
            else if (ynResponseStringType.equalsIgnoreCase("n")) {
                System.out.println("Goodbye then");
                gameLoop = false;
                //System.exit(0);
            }

        

        /*pickedNumber = (int)(Math.random()*100);
        //System.out.println(pickedNumber);
        while (guessTries>-1){uiNumber=userInput.nextInt();
        if(pickedNumber>uiNumber){
            System.out.println("Higher");
        }
        if(pickedNumber<uiNumber){
            System.out.println("Lower");
        }
        if(pickedNumber==uiNumber){
            System.out.println("Perfect!");
            System.exit(0);
        }if (guessTries == 0) {System.out.println("\n\n\n\n\n\n\n\n\n\nyou have ran out of guesses,\nbetter luck next time!\nthe number was "+pickedNumber);}
        if (guessTries > 0){System.out.println("you have "+guessTries+" more guess(es) left");}
        guessTries=guessTries-1;*/
        }

    }
}

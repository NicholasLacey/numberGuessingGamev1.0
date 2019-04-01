package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ynResponseStringType;
        Scanner userInput;
        userInput = new Scanner(System.in);

        boolean gameLoop = true;
       /* while (gameLoop) {








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

        }*/

       int pickedNumber, uiNumber;
        pickedNumber = (int)(Math.random()*100);
        System.out.println(pickedNumber);
        {uiNumber=userInput.nextInt();
        if(pickedNumber>uiNumber){
            System.out.println("Higher");
        }
        if(pickedNumber<uiNumber){
            System.out.println("Lower");
        }
        if(pickedNumber==uiNumber){
            System.out.println("Perfect!");
            System.exit(0);
        }}
        System.out.println(pickedNumber);
    }
}

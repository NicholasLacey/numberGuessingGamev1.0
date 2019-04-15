package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ynResponseStringType;
        Scanner userInput;
        userInput = new Scanner(System.in);
        int pickedNumber, uiNumber;
        boolean gameLoop = true;
                while (gameLoop) {
                    System.out.println("do you want to play again?(y/n?)");
                    ynResponseStringType = userInput.next();
                    if (ynResponseStringType.equalsIgnoreCase("y")) {


                System.out.println("great");
                pickedNumber = (int) (Math.random() * 100);
                System.out.println("___" +
                        "_____________________________________________________________________________________________" +
                        "______" +
                        "________________"+
                        "\nguess a number between 1 and 100");
                int guessTries = 5;
                while (guessTries > -1) {
                    uiNumber = userInput.nextInt();
                    if (pickedNumber > uiNumber) {
                        System.out.println("Higher, try another number");
                    }
                    if (pickedNumber < uiNumber) {
                        System.out.println("Lower, try another number");
                    }
                    if (pickedNumber == uiNumber) {
                        System.out.println("Perfect!"+"\n___" +
                                "_____________________________________________________________________________________" +
                                "___________________" +
                                "___________");
                        guessTries = -1;
                    }
                    if (uiNumber == 420) {
                        System.out.println("Perfect!"+
                                "             ,----------------,              ,---------,\n" +
                                "        ,-----------------------,          ,\"        ,\"|\n" +
                                "      ,\"                      ,\"|        ,\"        ,\"  |\n" +
                                "     +-----------------------+  |      ,\"        ,\"    |\n" +
                                "     |  .-----------------.  |  |     +---------+      |\n" +
                                "     |  |                 |  |  |     | -==----'|      |\n" +
                                "     |  |  I LOVE DOS!    |  |  |     |         |      |\n" +
                                "     |  |  Bad command or |  |  |/----|`---=    |      |\n" +
                                "     |  |  C:\\>_          |  |  |   ,/|==== ooo |      ;\n" +
                                "     |  |                 |  |  |  // |(((( [33]|    ,\"\n" +
                                "     |  `-----------------'  |,\" .;'| |((((     |  ,\"\n" +
                                "     +-----------------------+  ;;  | |         |,\"     -Kevin Lam-\n" +
                                "        /_)______________(_/  //'   | +---------+\n" +
                                "   ___________________________/___  `,\n" +
                                "  /  oooooooooooooooo  .o.  oooo /,   \\,\"-----------\n" +
                                " / ==ooooooooooooooo==.o.  ooo= //   ,`\\--{)B     ,\"\n" +
                                "/_==__==========__==_ooo__ooo=_/'   /___________,\"\n" +
                                "`-----------------------------'" +
                                "" +
                                "oh nice! a easter egg! thanks for finding me\n(hopefully in game but oh well)\nFeel fr" +
                                "e to keep playing, art is by Kevin Lam!"+

                                "\n___" +
                                "_____________________________________________________________________________________" +
                                "___________________" +
                                "___________");
                        guessTries = -1;
                    }
                    if (guessTries == 0) {
                        System.out.println("you have ran out of guesses,\nbetter luck next time!\nthe number was " + pickedNumber+"\n___" +
                     "___________________________________________________________________________________________________________________");
                    }
                    if (guessTries > 0) {
                        System.out.println("you have " + guessTries + " more guess(es) left");
                    }
                    guessTries = guessTries - 1;
                }

            } else if (ynResponseStringType.equalsIgnoreCase("n")) {
                System.out.println("Goodbye then");
                gameLoop = false;
            }
        }

    }
}

package org.vashonsd;

import java.util.Scanner;

public class RandomBot {
    public static void playGames() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to play a game?");
        String answ = scan.next();
        if (answ.equals("yes")) {
            Bot.play();
            System.exit(0);
        }
    }

    public static void play() {
        int userWins = 0;
        boolean playAgain = true;

        while (playAgain) {
            int theNumber = (int) (Math.random() * 100.0D + 1.0D);
            Scanner scan = new Scanner(System.in);
            int userGuess = -1;
            while (userGuess != theNumber) {
                System.out.println("Guess a number from 1 to 100:");
                userGuess = scan.nextInt();
                if (userGuess > theNumber) {
                    System.out.println("The number is too big!");
                } else if (userGuess < theNumber) {
                    System.out.println("The number is too small!");
                }
            }

            System.out.println("Congratulations, you got it!");
            ++userWins;
            System.out.println("Number of wins: " + userWins);
            System.out.println("Type yes if you want to play again, type no if not");
            Scanner answer = new Scanner(System.in);
            String answ = answer.next();
            answer.nextLine();
            playAgain = answ.trim().equalsIgnoreCase("yes");
        }

    }

    public static void workBot() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need to get anything done?");
        String answ = scan.next();
        if (answ.equals("yes")) {
            System.out.println("What is it that you need to get done?");
            answ = scan.next();
            System.out.println(answ + "? That sounds boring. Tell me something you need to accomplish this.");
            answ = scan.next();
            System.out.println("Do you need a list for your goal " + answ + "?");
            answ = scan.next();
            if (answ.equals("yes")) {
                System.out.println("Just write it down.");
            } else if (answ.equals("no")) {
                System.out.println("Okay, I wasn't going to do it anyway.");
            }
            System.exit(0);
        }

    }
    public static void quizBot() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to take a quiz?");
        String answ = scan.next();
        if (answ.equals("yes")) {
            System.out.println("What is the opposite of down?");
            answ = scan.next();
            if(answ.equals("up")) {
                System.out.println("Congratulations you got it right!");
            }

            else{
                String theAnswer = "up";
                System.out.println("Sorry, the answer was " + theAnswer);
            }
            System.out.println("Entertained?");
            answ = scan.next();
            System.out.println(answ + "? Okay. Please pay $50 to unlock the next question.");
            System.exit(0);
        }

    }
    public static void bot() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is there anything you want to do? At all?");
        String answ = scan.nextLine();

        if(answ.equals("yes")) {
            System.out.println("Oh. Alright. I don't provide any other services, sorry.");
        }
        else if(answ.equals("no")){
            System.out.println("Well, stop wasting both of our time then.");
        }
    }
}

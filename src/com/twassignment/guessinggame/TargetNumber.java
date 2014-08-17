package com.twassignment.guessinggame;

/**
 * Created by alisonps on 8/16/14.
 */
public class TargetNumber {
    private int targetNumber;
    private static final int GAME_RANGE = 100; //Set upper limit of game

    //Create a new random number between 1 and the upper limit as set above
    TargetNumber(){
        targetNumber = (int)(1 + (Math.random() * GAME_RANGE));
    }

    //Check whether the user's guess matches the target number
    boolean checkUserGuess(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        boolean correctGuess = false;
        String result;

        //Notify the user if they guess too high or too low
        if (guess < targetNumber)
            result = "Too low, try again";
        else if (guess > targetNumber)
            result = "Too high, try again";

        //Notify the user and set the correct guess flag as true
        else {
            result = "Great job!";
            correctGuess = true;
        }

        System.out.println(result);
        return correctGuess;
    }
}

package com.twassignment.guessinggame;

/**
 * Created by alisonps on 8/16/14.
 */
public class GuessingGame {

    public static void main(String[] args) {

        GuessingGameInputHelper helper = new GuessingGameInputHelper();
        TargetNumber targetNumber = new TargetNumber();
        boolean correctGuess = false;

        //Continue game until the player guesses correctly
        while(correctGuess == false) {
            String userGuess = helper.getUserGuess("Enter a guess");
            correctGuess = targetNumber.checkUserGuess(userGuess);
        }
    }
}




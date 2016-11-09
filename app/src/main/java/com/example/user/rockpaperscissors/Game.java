package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {


        public String play(int playerChoice){

            // 0 = rock, 1 = paper, 2 = scissors

            Random random = new Random();
            int randomChoice = random.nextInt(3);
            String computerChoice = "";
            if (randomChoice == 0) {
                computerChoice = "Rock";
            }

            else if (randomChoice == 1) {
                computerChoice = "Paper";
            }

            else if (randomChoice == 2) {
                computerChoice = "Scissors";
            }

            String result = "";

            String resultDraw = "Computer chose " + computerChoice + ". \n You chose the same, it's a draw!";
            String resultLose = "Computer chose " + computerChoice + ". \n You lose!";
            String resultWin = "Computer chose " + computerChoice + ". \n You win!";

            if (playerChoice == randomChoice) {
                result = resultDraw;
            }
            else if (playerChoice == 0 && randomChoice == 1 ||
                    playerChoice == 1 && randomChoice == 2 ||
                    playerChoice == 2 && randomChoice == 0) {
                result = resultLose;
            }
            else if (playerChoice == 0 && randomChoice == 2 ||
                    playerChoice == 1 && randomChoice == 0 ||
                    playerChoice == 2 && randomChoice == 1) {
                result = resultWin;
            }
            return result;

        }

    }

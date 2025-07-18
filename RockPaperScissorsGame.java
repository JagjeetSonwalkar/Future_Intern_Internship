/*
Task 2
Rock, paper, scissors game

Create a program that allows users to play the classic game of rock, paper, scissors against the computer. The user will input their choice, 
and the computer will randomly select one of the three options. The program will then determine the winner based on the rules of the game and display the result. 
The game will continue until the user decides to stop playing.
*/

import java.util.Scanner;
import java.util.Random;

class RockPaperScissorsGame
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Random randomObj = new Random();

        boolean keepPlaying = true;
        String choice[] = {"rock", "paper", "scissors"};
        String sUserChoice = null, sRandomChoice = null, sAgain = null;
        int iRandomIndex = 0;
        
        while(keepPlaying)
        {
            System.out.println("Enter your choice (rock, paper, scissors): ");
            sUserChoice = sobj.nextLine().toLowerCase();

            iRandomIndex = randomObj.nextInt(3);
            sRandomChoice = choice[iRandomIndex];

            System.out.println("Computer choice"+ sRandomChoice);

            switch(sUserChoice)
            {
                case "rock":
                    switch(sRandomChoice)
                    {
                        case "rock":
                            System.out.println("It's a tie !");
                            break;
                        case "paper":
                            System.out.println("You lose !");
                            break;
                        case "scissors":
                            System.out.println("You win");
                            break;
                    }
                break;


                case "paper":
                    switch(sRandomChoice)
                    {
                        case "rock":
                            System.out.println("You win");
                            break;
                        case "paper":
                            System.out.println("It's a tie !");
                            break;
                        case "scissors":
                            System.out.println("You lose !");
                            break;
                    }
                break;


                case "scissors":
                    switch(sRandomChoice)
                    {
                        case "rock":
                            System.out.println("You lose !");
                            break;
                        case "paper":
                            System.out.println("You win");
                            break;
                        case "scissors":
                            System.out.println("It's a tie !");
                            break;
                    }
                break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to play agin? (yes/no): ");
            sAgain = sobj.nextLine().toLowerCase();

            if(!sAgain.equals("yes"))
            {
                keepPlaying = false;
            }
        }
        System.out.println("Thank you for playing");
    }
}
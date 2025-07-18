/*
Task 1
Number Guessing game

Create a program that asks the user to guess a number between 1 and 100. The program should then give hints to the user until they guess the correct number.
*/

import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Random robj = new Random();

        int iGuessNumber = 0;
        int iSecretRandomNumber = robj.nextInt(100)+1 ;

        while(iGuessNumber != iSecretRandomNumber)
        {
            System.out.println("Guess a number between 1 and 100.");
            iGuessNumber = sobj.nextInt();

            if(iGuessNumber < 1 || iGuessNumber > 100)
            {
                System.out.println("!! Invalid number !!");
                break ;
            }

            if(iGuessNumber < iSecretRandomNumber)
            {
                System.out.println("Too low! Try again.");
            }
            else if(iGuessNumber > iSecretRandomNumber)
            {
                System.out.println("Too high! Try again.");
            }
            else if(iGuessNumber == iSecretRandomNumber)
            {
                System.out.println("Congratulations, You guessed the correct number.");
            }
            else
            {
                System.out.println("Something went wrong, please start the game from first !!");
            }
        }
    }
}
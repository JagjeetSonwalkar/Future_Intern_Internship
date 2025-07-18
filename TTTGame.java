/*
Task 3
Tic Tac Toe Game

Develop a program that enables two players to play a game of tic tac toe. The program will display a 3x3 grid and allow players to take turns entering their moves. 
It will check for a win or a draw after each move and announce the result.

The game will continue until there is a winner or the grid is full. Players can restart the game or exit after each round.
*/

import java.util.Scanner;

public class TTTGame
{
    static char[][] board = 
    {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do 
        {
            resetBoard();
            char currentPlayer = 'X';
            boolean gameEnded = false;

            while (!gameEnded) 
            {
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (isValidMove(row, col)) 
                {
                    board[row][col] = currentPlayer;
                    if (checkWin(currentPlayer)) 
                    {
                        printBoard();
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameEnded = true;
                    } 
                    else if (isBoardFull()) 
                    {
                        printBoard();
                        System.out.println("It's a draw!");
                        gameEnded = true;
                    } 
                    else 
                    {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                } 
                else 
                {
                    System.out.println("This move is not valid. Try again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } 
        while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static void printBoard() 
    {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean isValidMove(int row, int col) 
    {
        return row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == ' ';
    }

    public static boolean checkWin(char player) 
    {
        // Check rows, columns, diagonals
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static boolean isBoardFull() 
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    public static void resetBoard() 
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }
}
/*
Task 5
Random Password Generator

Create a program that generates random passwords based on criteria defined by the user, such as length and complexity (e.g., including uppercase letters, 
lowercase letters, numbers, and special characters). The user inputs the desired length and selects the types of characters to include. The program then 
generates and displays a random password meeting these specifications, ensuring strong security and usability.
*/

import java.util.*;

public class RandomPassGenrator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_+=<>?/";

        String combinedChars = "";
        StringBuilder password = new StringBuilder();

        // Step 1: Get user input
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Include uppercase letters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) 
        {
            combinedChars += upper;
        }

        System.out.print("Include lowercase letters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) 
        {
            combinedChars += lower;
        }

        System.out.print("Include numbers? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) 
        {
            combinedChars += numbers;
        }

        System.out.print("Include special characters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) 
        {
            combinedChars += special;
        }

        if (combinedChars.isEmpty()) 
        {
            System.out.println("No character sets selected. Please restart and choose at least one.");
            return;
        }

        // Step 2: Generate random password
        Random random = new Random();
        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(combinedChars.length());
            password.append(combinedChars.charAt(index));
        }

        // Step 3: Display result
        System.out.println("Generated Password: " + password.toString());
    }
}
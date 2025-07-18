/*
Task 1
Calculator

Create a basic calculator that can perform basic arithmetic operations such as addition, subtraction, multiplication, and division.
*/

import java.util.Scanner;

class ArithmeticOperation
{
    public int iResult ;

    public ArithmeticOperation()
    {
        iResult = 0;
    }

    public int addition(int iValue1, int iValue2)   // Add
    {
        iResult = iValue1 + iValue2;
        return iResult;
    }

    public int subtraction(int iValue1, int iValue2)    // sub
    {
        iResult = iValue1 - iValue2;
        return iResult;
    }

    public int multiplication(int iValue1, int iValue2) // mul
    {
        iResult = iValue1 * iValue2;
        return iResult;
    }

    public int division(int iValue1, int iValue2)   // div
    {
        iResult = iValue1 / iValue2;
        return iResult;
    }
}

class Calculator
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iOption = 0, iNum1 = 0, iNum2 = 0, iAns = 0;

        ArithmeticOperation arithmetic = new ArithmeticOperation();

        while(true)
        {
            System.out.println("/////////////////////////////////////////");
            System.out.println("0: exit from calculator.");
            System.out.println("1: perform Addition.");
            System.out.println("2: perform Subtraction.");
            System.out.println("3: perform Multiplication.");
            System.out.println("4: perform division.");
            System.out.println("/////////////////////////////////////////");

            System.out.println("Enter the option.");
            iOption = sobj.nextInt();

            System.out.println("/////////////////////////////////////////");

            if(iOption == 0)
            {
                System.out.println("Thank you for using Calculator.");
                break;
            }
            else if(iOption == 1)
            {
                System.out.println("Enter the first number: ");
                iNum1 = sobj.nextInt();

                System.out.println("Enter the second number:");
                iNum2 = sobj.nextInt();

                iAns = arithmetic.addition(iNum1,iNum2);

                System.out.println("Addition is: "+iAns);
            }
            else if(iOption == 2)
            {
                System.out.println("Enter the first number: ");
                iNum1 = sobj.nextInt();

                System.out.println("Enter the second number:");
                iNum2 = sobj.nextInt();

                iAns = arithmetic.subtraction(iNum1,iNum2);

                System.out.println("Subtraction is: "+iAns);
            }
            else if(iOption == 3)
            {
                System.out.println("Enter the first number: ");
                iNum1 = sobj.nextInt();

                System.out.println("Enter the second number:");
                iNum2 = sobj.nextInt();

                iAns = arithmetic.multiplication(iNum1,iNum2);
                System.out.println("Multiplication is: "+iAns);
            }
            else if(iOption == 4)
            {
                System.out.println("Enter the first number: ");
                iNum1 = sobj.nextInt();

                System.out.println("Enter the second number:");
                iNum2 = sobj.nextInt();

                iAns = arithmetic.division(iNum1,iNum2);
                System.out.println("division is: "+iAns);
            }
            else 
            {
                System.out.println("!! Invaild Option !!");
            }
        }
    }
}
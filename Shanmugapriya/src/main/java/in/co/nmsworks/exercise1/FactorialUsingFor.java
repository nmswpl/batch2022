package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Factorial using Forloop
public class FactorialUsingFor
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int numbers = S.nextInt();
        int fact = 1;

        for ( int i = numbers; i <= 1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+numbers+" is :"+fact);




        }
    }


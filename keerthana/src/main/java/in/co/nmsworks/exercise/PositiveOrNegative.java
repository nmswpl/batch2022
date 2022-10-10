/*
10. Write a program to Check if a Number is Positive or Negative using if else
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no= input.nextInt();
        if(no>0)
        {
            System.out.println("The given number"+no+" is positive");
        }
        else
        {
            System.out.println("The given number"+no+" is negative");
        }
    }
}

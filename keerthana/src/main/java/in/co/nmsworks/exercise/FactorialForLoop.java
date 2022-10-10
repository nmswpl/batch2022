/*
13. Write a program to Find Factorial of a number using for loop
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorialForLoop
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int no= input.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+no+" is:"+fact);

    }
}

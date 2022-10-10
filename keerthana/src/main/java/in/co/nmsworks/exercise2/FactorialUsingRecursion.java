/*16. Write a program using Recursion to find and print the factorial of a number.

 */



package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static long factorial( int no)
    {
        if(no==0)
        {
            return 1;
        }
        else
        {
            return (no * factorial(no-1));

        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no:");
        int no= input.nextInt();
        long fact=factorial(no);
        System.out.println("Factorial of "+no+" is: "+fact);
    }
}

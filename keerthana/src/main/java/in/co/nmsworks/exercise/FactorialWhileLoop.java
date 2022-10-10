/*
14. Write a program to Find Factorial of a number using while loop
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorialWhileLoop
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int no= input.nextInt();
        int fact=1;
        int i=1;
        while(i<=no)
        {
          fact=fact*i;
          i++;
        }
        System.out.println("The factorial of "+no+" is:"+fact);


    }
}

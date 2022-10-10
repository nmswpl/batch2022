/*
6. Write a program to Swap two numbers using temporary variable
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int no1= input.nextInt();
        System.out.println("Enter second number:");
        int no2= input.nextInt();
        System.out.println("Before Swapping numbers:\n First Number:"+no1+"\nSecond Number:"+no2);

        int temp1=no2;
        no2=no1;
        no1=temp1;
        System.out.println("After swapping numbers:\n First Number:"+no1+"\nSecond Number:"+no2);

    }
}

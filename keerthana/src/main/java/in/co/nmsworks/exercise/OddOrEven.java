/*
7. Check whether a number is even or odd using if...else statement
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        int no= input.nextInt();
        if(no%2==0)
        {
            System.out.println("The entered number "+no+" is even");
        }
       else
       {
           System.out.println("The entered number "+no+" is odd");
        }
    }
}

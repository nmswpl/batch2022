/*
12. Write a program to find the Sum of Natural Numbers using for loop
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int no= input.nextInt();
        int result=0;
        for(int i=1;i<=no;i++)
        {
            result+=i;
        }
        System.out.println("The sum is:"+result);

    }
}

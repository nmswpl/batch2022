/*1. Write a program to print all even numbers between 601 and 700 in descending order.*/

package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PrintNoInDescending
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        for(int i=700;i>=601;i--)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }



        }
    }

}

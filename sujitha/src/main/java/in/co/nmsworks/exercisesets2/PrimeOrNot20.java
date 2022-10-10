/*20. Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime*/
package in.co.nmsworks.exercisesets2;

import java.util.Scanner;

public class PrimeOrNot20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter a number");
        int n= sc.nextInt();
        for (int i = 2; i <= n / 2; i++)
        {
            if ((n % i == 0))
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(n+"  is prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }


    }
}


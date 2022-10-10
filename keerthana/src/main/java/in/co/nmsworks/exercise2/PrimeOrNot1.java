/*20. Given an integer x, Write a Program to check whether x is Prime or not ?

 */


package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PrimeOrNot1
{
    public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a Number:");
            int no= input.nextInt();
            boolean flag=false;
            for(int i=2;i<no;i++)
            {
                if(no%i==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag!=true)
            {
                System.out.println(no+" is a prime number");
            }
            else
            {
                System.out.println(no+" is not a prime number");
            }

        }
    }



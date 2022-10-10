package in.co.nmsworks.exercise2;
//Given an integer x, Write a Program to check whether x is Prime or not ?
//E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime

import java.util.Scanner;

public class workout20
{
    public static void main(String[] args)
    {
        System.out.println("ENTER NO : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int flag = 0;

        for (int i=2; i<=no/2; i++)
        {
            if(no%i == 0)
                flag = 1;
                break;

        }
        if(flag == 0)
            System.out.println("prime number");
        else
            System.out.println("not a prime no");
    }

}

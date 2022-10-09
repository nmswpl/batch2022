package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program14
{
    public static void factorial()
    {
        int  fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num :");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of num is :" + fact);

    }

    public static void main(String[] args) {
        factorial();
    }
}

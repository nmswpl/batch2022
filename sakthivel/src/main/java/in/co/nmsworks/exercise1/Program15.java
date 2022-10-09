package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program15
{
    public static void factorialUsingWhileLoop()
    {
        int i=1, fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num :");
        int num= sc.nextInt();
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of num is :" + fact);

    }

    public static void main(String[] args)
    {
        factorialUsingWhileLoop();
    }
}

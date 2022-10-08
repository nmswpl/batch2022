package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorialUsingRecursion
{

    public static int factorial(int num)
    {
        if (num == 0)
            return 1;
        else
            return (num * factorial(num-1));

    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();

        int fact = 1;

        fact = factorial(num);

        System.out.println("The Factorial of "+num+" is"+fact);


    }
}

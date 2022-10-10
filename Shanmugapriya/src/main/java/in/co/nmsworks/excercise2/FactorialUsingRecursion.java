package in.co.nmsworks.excercise2;

import java.util.Scanner;
//Factorial using recursion
public class FactorialUsingRecursion
{
    public static int Factorial(int n)
    {
        if(n == 0)
            return 1;
        else
            return (n*Factorial(n-1));
    }


    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();
        int fact = 1;

        fact = Factorial(num);

        System.out.println("Factorial of 6 "+fact);


    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Factorial Using For Loop
public class FactorialUsingFor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i ++)
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

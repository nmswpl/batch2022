package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Factorial Using While Loop
public class FactorialUsingWhile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int factorial = 1;
        int i =1;
        while (i <= number)
        {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

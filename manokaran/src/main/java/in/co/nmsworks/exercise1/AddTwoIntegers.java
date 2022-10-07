package in.co.nmsworks.exercise1;

import java.util.Scanner;

// Add Two Integers
public class AddTwoIntegers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum of " + number1 + " + " + number2 + " = " + sum);
    }
}

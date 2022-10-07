package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Multiply Two Floating Integers
public class MultiplyTwoFloatingIntegers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter number2 : ");
        float number2 = scanner.nextFloat();
        float product = number1 * number2;
        System.out.println("Product of " + number1 + " * " + number2 + " = " + product);
    }
}

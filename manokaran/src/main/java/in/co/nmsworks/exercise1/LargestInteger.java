package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Largest Integer Among Three Numbers
public class LargestInteger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3 : ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3)
        {
            System.out.println(number1 + " is the Largest");
        }
        else if (number2 > number1 && number2 > number3)
        {
            System.out.println(number2 + " is the Largest");
        }
        else
        {
            System.out.println(number3 + " is the Largest");
        }
    }
}

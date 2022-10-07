package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Calculate Power Using For Loop
public class CalculatePowerUsingFor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int baseNumber = scanner.nextInt();
        System.out.print("Enter power : ");
        int power = scanner.nextInt();
        int powerOfNum = 1;
        for (int i = 0; i < power; i ++)
        {
            powerOfNum *= baseNumber;
        }
        System.out.println("Answer : " + powerOfNum);
    }
}

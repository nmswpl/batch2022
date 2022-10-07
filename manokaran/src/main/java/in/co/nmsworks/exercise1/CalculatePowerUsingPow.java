package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Calculate Power Using Pow() Method
public class CalculatePowerUsingPow
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int baseNumber = scanner.nextInt();
        System.out.print("Enter power : ");
        int power = scanner.nextInt();
        int answer = (int) Math.pow(baseNumber,power);
        System.out.println("Answer : " + answer);
    }
}

package in.co.nmsworks.exercise;

import java.util.Scanner;

public class CalculateUsingPower
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the base value :");
        double base = S.nextInt();

        System.out.println("Enter the Power :");
        double power = S.nextInt();

        double answer = Math.pow(base,power);
        System.out.println("Answer ="+answer);
    }
}

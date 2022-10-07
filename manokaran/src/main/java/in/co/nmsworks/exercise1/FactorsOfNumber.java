package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Factors of a Number
public class FactorsOfNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i ++)
        {
            if (number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

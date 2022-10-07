package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Sum of Natural Numbers
public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i ++)
        {
            sum += i;
        }
        System.out.println("Sum of " + number + " is "  + sum);
    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Count Number of Digits in a Number
public class CountNoOfIntegers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0)
        {
            number = number / 10;
            count += 1;
        }
        System.out.println("Number of Integers : " + count);
    }
}

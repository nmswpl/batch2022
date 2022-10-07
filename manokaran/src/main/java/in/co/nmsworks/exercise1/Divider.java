package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Get Remainder and Quotient
public class Divider
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        float number = scanner.nextFloat();
        System.out.print("Enter divider : ");
        float divider = scanner.nextFloat();
        float quotient = number / divider;
        float remainder = number % divider;
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}

package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr Two Values :");
        int dividend =scanner.nextInt();
        scanner.nextLine();
        int divisor = scanner.nextInt();
        scanner.nextLine();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program12
{
    public static void quotientAndRemainder()
    {
        int dividend=20;
        int divisor=5;
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;

        System.out.println("quotient is =" + quotient);
        System.out.println("Remainder is =" + remainder);
    }


    public static void main(String[] args)
    {
        quotientAndRemainder();
    }
}

/*
5. Write a program to Compute Quotient and Remainder
Output:
Quotient = 6
Remainder = 1
*/


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a divisor:");
        float divisor= input.nextFloat();
        System.out.println("Enter a dividend:");
        float dividend= input.nextFloat();
        float quotient=divisor/dividend;
        float remainder=divisor%dividend;
        System.out.println("The quotient is:"+quotient+"\n"+"The remainder is:"+remainder);
    }
}

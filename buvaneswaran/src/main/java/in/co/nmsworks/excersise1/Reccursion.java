package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class Reccursion
{
    public static int fibbo(int number)
    {
        if (number >= 1)
            return number * fibbo(number - 1);
        else
            return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= sc.nextInt();sc.nextLine();
        int factorial = fibbo(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}


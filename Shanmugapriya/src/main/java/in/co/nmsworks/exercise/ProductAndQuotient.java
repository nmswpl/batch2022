package in.co.nmsworks.training.program.exercise;

import java.util.Scanner;

public class ProductAndQuotient
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int number1 = S.nextInt();

        System.out.println("Enter the 2nd number :");
        int number2 = S.nextInt();

        double quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The quotient is :"+quotient);
        System.out.println("The remainder is :"+remainder);

    }
}
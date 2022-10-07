package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("DIVIDEND :");
        int dividend = sc.nextInt();
        System.out.println("DIVIDER");
        int divider = sc.nextInt();
        int quotient,remainder;

        quotient = dividend / divider;
        remainder = dividend % divider;
        System.out.println("QUOTIENT :"+quotient +'\n'+ "REMAINDER :" + remainder);

    }

}

//  5. Write a program to Compute Quotient and Remainder

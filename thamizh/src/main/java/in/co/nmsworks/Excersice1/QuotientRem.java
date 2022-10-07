package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class QuotientRem {

    //5. Write a program to Compute Quotient and Remainder

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the divident and divisor");

        int divident= in.nextInt();;
        int divisor=in.nextInt();

        float quotient=divident/divisor;
        int rem=divident%divisor;

        System.out.println("quotiont is "+quotient);
        System.out.println("reminder is "+rem);

    }
}

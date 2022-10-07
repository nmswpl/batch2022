package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //program to Compute Quotient and Remainder
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dividend : ");
        int value=sc.nextInt();
        System.out.println("enter divisor: ");
        int divisor= sc.nextInt();
        int remainder=value%divisor;
        int quotient=value/divisor;
        System.out.println("the quotient is : " + remainder);
        System.out.println("the remainder is : "+quotient);


    }
}

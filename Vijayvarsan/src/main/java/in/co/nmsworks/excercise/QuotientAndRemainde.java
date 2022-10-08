package in.co.nmsworks.excercise;

import java.util.Scanner;

public class QuotientAndRemainde {

//    5. Write a program to Compute Quotient and Remainder
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("FIND THE NUMBER Quotient AND Remainder");
        System.out.println("ENTER VALUE");
        int value= scan.nextInt();
        System.out.println("DIVIDED by");
        int dv= scan.nextInt();
        System.out.println("THE QUOTIET IS = " + (value/dv));
        System.out.println("REMINDER = " + (value%dv));

    }

}

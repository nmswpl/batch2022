package in.co.nmsworks.exercise;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no");
        int n1 = in.nextInt();
        System.out.println("Enter no");
        int n2 = in.nextInt();

        int n3 = n1/n2;

        System.out.println("Quotient is : "+n3);

        int n4 = n1%n2;
        System.out.println("Remainder is : "+n4);

    }
}

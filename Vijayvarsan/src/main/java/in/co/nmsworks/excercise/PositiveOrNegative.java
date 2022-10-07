package in.co.nmsworks.excercise;

import java.util.Scanner;

public class PositiveOrNegative {
    //10. Write a program to Check if a Number is Positive or Negative using if else
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("TO CHECK THE NUMBER IS NEGATIVE OR POSITIVE");
        int value = scan.nextInt();
        if(value<0)
            System.out.println("THE NUMBER IS NEGATIVE");
        else
            System.out.println("THE NUMBER IS POSITIVE");
    }
}

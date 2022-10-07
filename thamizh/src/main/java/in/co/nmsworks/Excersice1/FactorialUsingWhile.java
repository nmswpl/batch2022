package in.co.nmsworks.Excersice1;

import java.util.Scanner;

//14. Write a program to Find Factorial of a number using while loop

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter nummber");
        int num = in.nextInt();

        int fact=1;

        int i=1;
        while (i<=num)
        {

           fact=fact*i;
           i++;

        }

        System.out.println(fact);
    }
}

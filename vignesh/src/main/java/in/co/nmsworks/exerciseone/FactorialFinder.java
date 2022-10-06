package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FactorialFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the given number is : " + fact);

    }
}


//  13. Write a program to Find Factorial of a number using for loop
package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FactorialFinderRecursion2 {

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return (n * factorial(n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);

    }
}


// 16. Write a program using Recursion to find and print the factorial of a number.
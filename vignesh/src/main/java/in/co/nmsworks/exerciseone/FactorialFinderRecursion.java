package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FactorialFinderRecursion {

    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        return (n * fact(n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println(fact);

    }
}

//   23. Write a program to find Factorial of a Number Using Recursion

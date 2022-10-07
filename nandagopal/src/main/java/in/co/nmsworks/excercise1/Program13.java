package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Factorial of a number using for loop
public class Program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int fact = 1;

        for(int i=n; i>0; i--) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}

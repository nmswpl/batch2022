package in.co.nmsworks.excercise1;

import java.util.Scanner;

// factorial of a number using while loop
public class Program14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int temp = n;
        int fact = 1;

        while(temp > 0) {
            fact *= temp;
            temp -= 1;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}

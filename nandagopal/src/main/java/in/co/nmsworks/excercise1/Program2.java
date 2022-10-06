package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Add two numbers
public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = in.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Multiply two floating point numbers
public class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first float number : ");
        double num1 = in.nextDouble();
        System.out.println("Enter second float number : ");
        double num2 = in.nextDouble();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}

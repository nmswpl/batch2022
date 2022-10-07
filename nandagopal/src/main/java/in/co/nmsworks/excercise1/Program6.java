package in.co.nmsworks.excercise1;

import java.util.Scanner;

// swap two number using temp variable
public class Program6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = in.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap num1 : " + num1 + ", num2 : " + num2);
    }
}


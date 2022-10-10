package in.co.nmsworks.training.practice;

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter  numbers ");
        float number1 = number.nextFloat();
      //  System.out.println("second number");
        float number2 = number.nextFloat();
        float sum = number1 * number2;
        System.out.println("The product is " +sum);

    }
}


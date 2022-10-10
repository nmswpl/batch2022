package in.co.nmsworks.training.excercise1;

import java.util.Scanner;

public class FloatValueMultiply {
    public static void main(String[] args) {
        float num1, num2, res;
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        res = num1 * num2;

        System.out.println("Multiplication of two numbers is  : " + res);
    }
}

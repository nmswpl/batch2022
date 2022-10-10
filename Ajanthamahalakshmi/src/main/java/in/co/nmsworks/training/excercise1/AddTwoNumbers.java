package in.co.nmsworks.training.excercise1;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, res;
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        res = num1 + num2;

        System.out.println("Addition of two numbers is  : " + res);
    }
}

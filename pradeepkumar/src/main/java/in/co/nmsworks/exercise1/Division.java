package in.co.nmsworks.exercise1;
//division the numbers to get remainder and quotient

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber= sc.nextInt();

        System.out.println("Enter the second number");
        int secondNumber= sc.nextInt();
        int remainder=firstNumber % secondNumber;
        int quotient=firstNumber / secondNumber;

        System.out.println("Remainder =" + remainder);
        System.out.println("Quotient =" + quotient);
    }
}

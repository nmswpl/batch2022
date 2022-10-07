package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Add two numbers
public class AddTheNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber= scanner.nextInt();

        System.out.println("Enter the second number :");
        int secondNumber= scanner.nextInt();

        int sum=firstNumber+secondNumber;
        System.out.println(sum);
    }
}

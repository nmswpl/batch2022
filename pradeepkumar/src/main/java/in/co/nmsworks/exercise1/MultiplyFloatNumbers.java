package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class MultiplyFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the FirstNumber :");
        float firstNumber= scanner.nextFloat();

        System.out.println("Enter the second Number :");
        float secondNumber= scanner.nextFloat();

        float multiply=firstNumber * secondNumber;
        System.out.println(multiply);

    }
}

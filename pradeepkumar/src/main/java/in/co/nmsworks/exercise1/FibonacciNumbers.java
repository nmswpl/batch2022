package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number=scanner.nextInt();
        int firstNumber=-1;
        int secondNumber=1;
        int thirdNumber;

        for (int i = 1; i <=number; i++) {
            thirdNumber=firstNumber+secondNumber;
            System.out.println(thirdNumber);
            firstNumber=secondNumber;
            secondNumber=thirdNumber;


        }
    }
}

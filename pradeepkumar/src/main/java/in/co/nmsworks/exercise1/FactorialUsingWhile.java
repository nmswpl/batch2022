package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        int factorial=1;
//        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =");
        int number = scanner.nextInt();
        factorial=number;

        while (number>1)
        {
            number--;
            factorial=factorial * number;
//            i++;

        }
        System.out.println("The factorial of the number"  + "=" + factorial);
    }
}

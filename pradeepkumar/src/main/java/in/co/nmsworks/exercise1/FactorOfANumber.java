package in.co.nmsworks.exercise1;
//factor program

import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        for (int i = 1; i <=number ; i++) {
            if (number % i ==0)
            {
                System.out.println(i);
            }

        }
    }
}

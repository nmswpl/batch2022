package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum=1;

        for (int i =1; i <number; i++) {
            sum=sum + i;
            sum++;

        }
        System.out.println("The sum of natural number is" + sum);
    }
}

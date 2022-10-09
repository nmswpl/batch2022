package in.co.nmsworks.training.practice;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        System.out.println("you entered " + number);
    }
}


package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class LargestFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        System.out.println("1. ");
        int firstNumber = sc.nextInt();
        System.out.println("2. ");
        int secondNumber = sc.nextInt();
        System.out.println("3. ");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber) {

            if (firstNumber > thirdNumber) {
                System.out.println("firstNumber is greater");
            }
        }
        else if (secondNumber > thirdNumber) {
            System.out.println("secondNumber is greater");
        }
        else {
            System.out.println("thirdNumber is greater");
        }

    }


}

//  9. Write a program to Find Largest Among three numbers using if else statement.
package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Positive Number");
        }
        else if (number < 0) {
            System.out.println("Negative Number");

        }
        else
            System.out.println("Number is zero");

    }

}

//   10. Write a program to Check if a Number is Positive or Negative using if else

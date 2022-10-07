package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FactorialFinder2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (n != 0){
            fact = fact * i;
            n--;
            i++;
        }
        System.out.println("Factorial of the given number is : " + fact);


    }

}

//  14. Write a program to Find Factorial of a number using while loop
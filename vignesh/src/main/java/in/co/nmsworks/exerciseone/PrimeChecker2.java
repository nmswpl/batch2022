package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PrimeChecker2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int primeCounter = 0;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                primeCounter++;
            }

        }
        if (primeCounter != 0 ) {
            System.out.println("Not a prime number");

        }else {
            System.out.println("Is a prime");
        }


    }


}

//  20. Given an integer x, Write a Program to check whether x is Prime or not ?


package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PrimeChecker {

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
            System.out.println("It's not a prime number");

        }else {
            System.out.println("It's a prime");
        }
    }
}

//   21. Write a program to Check Prime Number using a for loop

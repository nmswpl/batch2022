package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FactorsFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Factors :");
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0){
                System.out.print(i +" ");
            }
        }


    }

}

//   22. Write a program to find Factors of a Positive Integer

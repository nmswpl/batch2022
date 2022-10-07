package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int n = sc.nextInt();
//        int sum = (n * (n+1) )/2;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of Natural number within "+ n + " = "+sum);

    }
}

//  12. Write a program to find the Sum of Natural Numbers using for loop
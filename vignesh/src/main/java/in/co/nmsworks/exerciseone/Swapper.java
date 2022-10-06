package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class Swapper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("First Variable ");
        double firstVariable = sc.nextDouble();
        System.out.print("Second Variable ");
        double secondVariable = sc.nextDouble();

        double temp;
        temp = firstVariable;
        firstVariable = secondVariable;
        secondVariable = temp;
        System.out.println("After Swapping");
        System.out.println("First Number " + firstVariable);
        System.out.println("Second Number " + secondVariable);

    }

}

//  6. Write a program to Swap two numbers using temporary variable
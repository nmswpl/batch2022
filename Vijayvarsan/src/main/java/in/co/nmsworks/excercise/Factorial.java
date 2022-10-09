package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Factorial {
    //13. Write a program to Find Factorial of a number using for loop

    public static void main(String[] args) {
        
        System.out.println("FACTORIAL OF THE NUMBER 10");
        int fact = 10;
        int n=1;
        for(int i = 1 ; i<=fact;i++)
        {

            n=n*i;
        }

        System.out.println(n);

    }
}

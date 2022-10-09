package in.co.nmsworks.excercise;

import java.util.Scanner;

public class FactorialWhile {
    //14. Write a program to Find Factorial of a number using while loop
    public static void main(String[] args) {
       
        System.out.println("FACTORIAL USING WHILE LOOP");

        int fact = 5;
        int n = 1;
        int i=1;
        while (i<=fact){
            n=n*i;
            i++;
        }
        System.out.println(n);
    }
}

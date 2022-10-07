// 16. Write a program using Recursion to find and print the factorial of a number.
package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact;
        System.out.print("Enter a Number ");
        int number = input.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is " + fact);
    }
    static int factorial(int number){
        if(number==0){
            return 1;
        }
        else{
            return number * factorial(number-1);
        }
    }
}

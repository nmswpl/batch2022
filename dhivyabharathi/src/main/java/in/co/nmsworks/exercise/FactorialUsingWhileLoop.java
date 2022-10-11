package in.co.nmsworks.exercise;
//14. Write a program to Find Factorial of a number using While loop
import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        int n =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no ");
        int fact = in.nextInt();
        int i =1;
        while (i<=fact)
        {
            n = n*i;
            i++;
        }

        System.out.println("Factorial of Given no is : "+n);
    }
}

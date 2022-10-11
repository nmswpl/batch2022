package in.co.nmsworks.exercise;
// 13. Write a program to Find Factorial of a number using for loop
import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        int n =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No");
        int fact = in.nextInt();
        for (int i = 1; i <=fact ; i++)
        {
            n = n*i;
        }

        System.out.println("Factorial of Given No : "+n);

    }
}

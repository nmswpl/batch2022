package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class FactorialUsingRecursion {

//    static int factorial=0;
    public static int fact(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= scanner.nextInt();

        System.out.println("Factorial of "+ n + "is" + fact(n));
    }
}

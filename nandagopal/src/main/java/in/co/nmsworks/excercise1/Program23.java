package in.co.nmsworks.excercise1;

import java.util.Scanner;

// find factorial of a number using recursion
public class Program23 {
    public static int findFact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * findFact(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        System.out.println("Result of " + n + " = " + findFact(n));

    }
}

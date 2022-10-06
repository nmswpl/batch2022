package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci : ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i < n-1; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}


//      16. Display Fibonacci Series Using for Loop
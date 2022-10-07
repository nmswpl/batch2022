package in.co.nmsworks.excercise1;

import java.util.Scanner;

// multiplication table
public class Program15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}

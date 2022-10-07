package in.co.nmsworks.excercise1;

import java.util.Scanner;

// sum of natural numbers
public class Program12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}

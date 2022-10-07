package in.co.nmsworks.excercise1;

import java.util.Scanner;

// check prime number using for loop
public class Program21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }

        System.out.println(n + " is a prime number");
    }
}

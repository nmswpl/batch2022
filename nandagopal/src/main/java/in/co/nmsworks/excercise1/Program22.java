package in.co.nmsworks.excercise1;

import java.util.Scanner;

// find factors of a positive integer
public class Program22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();

        System.out.print("Factors of " + n + " are: ");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}

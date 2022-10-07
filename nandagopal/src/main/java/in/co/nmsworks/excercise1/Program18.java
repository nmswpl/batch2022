package in.co.nmsworks.excercise1;

import java.util.Scanner;

// count number of digits in number using while loop
public class Program18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int digitsCount = 0;

        if(n == 0) {
            System.out.println("Number of digits : " + 0);
            return;
        }

        while(n > 0) {
            digitsCount += 1;
            n /= 10;
        }

        System.out.println("Number of digits : " + digitsCount);
    }
}

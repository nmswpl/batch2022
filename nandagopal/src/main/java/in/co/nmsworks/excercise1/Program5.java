package in.co.nmsworks.excercise1;

import java.util.Scanner;

// find quotient and remainder
public class Program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int num1 = in.nextInt();
        System.out.println("Enter divisor : ");
        int num2 = in.nextInt();
        System.out.println("quotient : " + (num1/num2));
        System.out.println("remainder : " + (num1%num2));
    }
}

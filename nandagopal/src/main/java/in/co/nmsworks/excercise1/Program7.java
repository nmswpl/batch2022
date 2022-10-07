package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Find odd or even
public class Program7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}

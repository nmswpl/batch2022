package in.co.nmsworks.excercise1;

import java.util.Scanner;

//Print integer entered by the user
public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Entered number is : " + n);
    }
}

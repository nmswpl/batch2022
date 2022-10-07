package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Find ascii of character
public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = in.next().charAt(0);
        System.out.println("Ascii value of " + c + " is " + (int) c);
    }
}

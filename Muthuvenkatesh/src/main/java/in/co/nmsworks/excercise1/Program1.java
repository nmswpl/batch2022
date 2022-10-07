// 1. Write a Program to Print an Integer entered by the User.
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered: "+number);
    }
}
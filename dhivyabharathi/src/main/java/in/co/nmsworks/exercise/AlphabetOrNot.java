package in.co.nmsworks.exercise;
//11. Write a program to Check Alphabet using if else
import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        char CheckValue = in.next().charAt(0);
        if( (CheckValue >= 'a' && CheckValue <= 'z') || (CheckValue >= 'A' && CheckValue <= 'Z'))
            System.out.println(CheckValue + " is an alphabet.");
        else
            System.out.println(CheckValue + " is not an alphabet.");

    }
}

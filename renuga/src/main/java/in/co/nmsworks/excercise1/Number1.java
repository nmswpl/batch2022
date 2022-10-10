package in.co.nmsworks.excercise1;

/*1. Write a Program to Print an Integer entered by the User*/
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        int number1;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter  number");
        number1=input.nextInt();
        System.out.println("you enter num : "+ number1);
    }

}

package in.co.nmsworks.exercise;
//1. Write a Program to Print an Integer entered by the User.
import java.util.Scanner;

public class Userno {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no");
        int n = in.nextInt();
        System.out.println("Given no is : "+n);

    }
}

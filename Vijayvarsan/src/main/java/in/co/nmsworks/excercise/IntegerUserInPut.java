package in.co.nmsworks.excercise;

import java.util.Scanner;

public class IntegerUserInPut {

// 1. Write a Program to Print an Integer entered by the User.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE INTEGER VALUE AND IT WILL BE PRINTED");
        int value = scan.nextInt();
        System.out.println("THE ENTERED VALUE IS = " + value);
    }
}

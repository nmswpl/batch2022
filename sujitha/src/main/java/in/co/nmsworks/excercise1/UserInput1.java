/*1. Write a Program to Print an Integer entered by the User.*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a= sc.nextInt();
        System.out.println("you entered: "+a);
    }
}



//Write a Program to Print an Integer entered by the User.


package in.co.nmsworks.exercise1;

import java.util.Scanner;


public class problem1
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter a number: ");

        Scanner value = new Scanner(System.in);
        n = value.nextInt();

        System.out.println("You entered: " + n);
    }
}

/*1. Write a Program to Print an Integer entered by the User.
Enter a number: 10
You entered: 10 */

package in.co.nmsworks.exercise;

import java.util.Scanner;

public class PrintInteger
{
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner inp=new Scanner(System.in);
        int input= inp.nextInt();
        System.out.println("The entered number is "+input);
    }
}

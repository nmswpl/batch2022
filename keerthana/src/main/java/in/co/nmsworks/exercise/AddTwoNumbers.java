/*2. Write a Program to Add Two Integers.
        Output:
        Enter two numbers
        10 20
        The sum is: 30*/

package in.co.nmsworks.exercise;

import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNo= input.nextInt();
        System.out.println("Enter second number:");
        int secondNo= input.nextInt();
        int result=firstNo+secondNo;
        System.out.println("The Sum is:"+result);
    }
}

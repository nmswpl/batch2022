/*23. Write a program to find Factorial of a Number Using Recursion

 */

package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static int factorial(int no)
    {
        if(no>=1)
        {
            return no * factorial(no-1);
        }
        else
        {
            return 1;
        }


    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no:");
        int no= input.nextInt();
        int fact=factorial(no);
        System.out.println("Factorial of "+no+"is"+fact);
    }
}

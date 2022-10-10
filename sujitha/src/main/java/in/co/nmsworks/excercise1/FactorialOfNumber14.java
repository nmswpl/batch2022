/*14. Write a program to Find Factorial of a number using while loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class FactorialOfNumber14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number= sc.nextInt();
        int result=1;

        if(number==0)
        {
            System.out.println("factorial of "+number+" is 1");
        }
        else
        {
            System.out.print("factorial of "+number+" is ");
            int i=number;
            while (i>=1)
            {
                result=result*number;
                number--;
                i--;
            }
        }
        System.out.print(result);

    }
}

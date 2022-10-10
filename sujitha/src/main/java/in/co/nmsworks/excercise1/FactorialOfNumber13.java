/*13. Write a program to Find Factorial of a number using for loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class FactorialOfNumber13
{
    public static void main(String[] args) {
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
            for(int i=number;i>=1;i--)
            {
                result=result*number;
                number--;
            }
        }
        System.out.print(result);
    }
}

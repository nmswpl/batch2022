/*21. Write a program to Check Prime Number using a for loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class PrimeOrNot21
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        System.out.println("enter a number");
        int n= sc.nextInt();
        for (int i = 2; i <= n / 2; i++)
        {
            if ((n % i == 0))
            {
                ch++;
                break;
            }
        }
        if(ch==0)
        {
            System.out.println(n+"  is prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }

    }
}

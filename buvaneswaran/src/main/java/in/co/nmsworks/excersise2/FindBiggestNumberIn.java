package in.co.nmsworks.excersise2;

import java.util.Scanner;


//Write a program to print the biggest of the 3 numbers
public class FindBiggestNumberIn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Elements");
        int a= sc.nextInt();sc.nextLine();
        int b= sc.nextInt();sc.nextLine();
        int c= sc.nextInt();sc.nextLine();
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>a && b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program6
{
    public static void largestAmongThreeNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }

    }

    public static void main(String[] args)
    {
        largestAmongThreeNum();
    }
}

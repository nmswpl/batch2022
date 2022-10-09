package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program19
{
    public static void primeNumberUsingLoop()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= sc.nextInt();

            while(num%2==0)
            {
                System.out.println(("is a even number"));
                break;
            }


    }

    public static void main(String[] args)
    {
        primeNumberUsingLoop();
    }

}

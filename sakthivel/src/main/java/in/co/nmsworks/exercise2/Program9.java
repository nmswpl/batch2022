package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program9
{
    public static void primeOrNot()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();

            if(x % 2!=0)
            {
                System.out.println("X is prime");
            }
            else
            {
                System.out.println("X is not prime");
            }

    }

    public static void main(String[] args)
    {
        primeOrNot();
    }
}

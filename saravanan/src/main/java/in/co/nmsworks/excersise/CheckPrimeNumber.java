package in.co.nmsworks.excersise;

import java.util.Scanner;

public class CheckPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int number =s.nextInt();
        int prime=0;
        for(int i=2;i<number/2;i++)
        {
            if(number % i == 0)
            {
                System.out.println(number+" is not a prime");
                break;
            }
            else
            {
                prime=1;
            }
        }
        if(prime == 1)
        {
            System.out.println(number+" is a prime");
        }
    }
}

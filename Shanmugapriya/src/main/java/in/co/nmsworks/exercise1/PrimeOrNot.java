package in.co.nmsworks.exercise1;

import java.util.Scanner;
//prime or not
public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            for ( int i = 3 ; i < num/2; i++)
            {
                if( num % i == 0)
                {
                    System.out.println(num+" is not prime");
                    break;
                }
                else {
                    System.out.println(num+" is prime");

                }
            }
        }

    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Check Prime Number Or Not
public class CheckPrime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isprime = true;
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        for (int i = 2; i < number ; i ++)
        {
            if(number % i == 0)
            {
                isprime = false;
                System.out.println(number + " is not a Prime Number ");
                break;
            }
        }
        if (isprime)
        {
            System.out.println(number + " is Prime Number");
        }
    }
}

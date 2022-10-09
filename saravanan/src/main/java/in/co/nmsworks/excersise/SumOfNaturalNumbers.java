package in.co.nmsworks.excersise;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the range of number");
        int number = s.nextInt();

        int sum=0;
        for(int i=1;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println(sum+" is the sum of natural numbers");
    }
}

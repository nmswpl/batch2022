package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();sc.nextLine();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of natural number is :" + sum);
    }
}

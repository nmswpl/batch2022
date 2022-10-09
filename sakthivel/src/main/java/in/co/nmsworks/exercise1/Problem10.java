package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Problem10
{
    public static void sumOfNaturalNumber()
    {
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a= sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        sumOfNaturalNumber();
    }
}

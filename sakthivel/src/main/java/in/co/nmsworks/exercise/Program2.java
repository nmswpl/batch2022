package in.co.nmsworks.training.exercise;

import java.util.Scanner;

public class Program2
{
    public static void addition()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int sum;
        sum=a+b;
        System.out.println("The sum is : "+ sum);
    }

    public static void main(String[] args)
    {
        addition();
    }
}

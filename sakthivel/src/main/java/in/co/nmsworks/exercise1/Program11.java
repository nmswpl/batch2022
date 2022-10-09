package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program11
{
    public static void multiplicationTable()
    {
        int num=10;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }

    public static void main(String[] args)
    {
        multiplicationTable();
    }
}

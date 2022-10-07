package in.co.nmsworks.excersise2;

import java.util.Scanner;

public class Excersise6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();sc.nextLine();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}

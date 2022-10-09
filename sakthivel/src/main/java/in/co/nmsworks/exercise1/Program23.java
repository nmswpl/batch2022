package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program23
{
    public static void powerOfANum()
    {
        int power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Num");
        int a= sc.nextInt();
        System.out.println("Enter the Exponent Num");
        int b= sc.nextInt();
        for(int i=0;i<b;i++)
        {
          power=power*a;
        }
        System.out.println(power);
    }

    public static void main(String[] args)
    {
        powerOfANum();
    }
}

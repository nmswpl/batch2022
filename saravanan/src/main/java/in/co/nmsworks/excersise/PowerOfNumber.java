package in.co.nmsworks.excersise;

import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the base number");
        int baseNumber =s.nextInt();
        System.out.println("enter the power number");
        int powerNumber=s.nextInt();
        int ans=1;
        for(int i=1;i<=powerNumber;i++)
        {
           ans*=baseNumber;
        }
        System.out.println(ans);
    }
}

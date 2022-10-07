package in.co.nmsworks.excersise;

import java.util.Scanner;

public class PowerOfNumberUsingFunction
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the base number");
        int baseNumber =s.nextInt();
        System.out.println("enter the power number");
        int powerNumber=s.nextInt();
        int powerValue= (int) Math.pow(baseNumber,powerNumber);
        System.out.println(powerValue);
    }
}

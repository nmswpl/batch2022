package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program24
{
    public static void powerOfANumbeUusingPowFunction()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Num");
        int a= sc.nextInt();
        System.out.println("Enter the Exponent Num");
        int b= sc.nextInt();
        System.out.println(Math.pow(a,b));
    }

    public static void main(String[] args)
    {
        powerOfANumbeUusingPowFunction();
    }
}

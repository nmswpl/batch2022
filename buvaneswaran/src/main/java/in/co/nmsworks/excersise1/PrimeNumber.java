package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();sc.nextLine();
        boolean flag = false;
        for (int i=2;i<num/2;i++)
        {
            if (num%2==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println(num + "Not a prime number");
        else
            System.out.println(num + "is a prime number");
    }
}

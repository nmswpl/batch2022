package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        sc.nextLine();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}

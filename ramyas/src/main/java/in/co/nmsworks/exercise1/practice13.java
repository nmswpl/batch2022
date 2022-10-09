package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class practice13
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = 1;

        for(int i=1;i<no;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+no +" = "+fact);
    }
}

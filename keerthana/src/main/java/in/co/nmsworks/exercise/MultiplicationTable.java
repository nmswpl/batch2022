/*
15. Generate Multiplication Table using for loop
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter table number:");
        int no= input.nextInt();
        int num=1;
        for(int i=1;i<=10;i++)
        {
            num=no*i;
            System.out.println(no+" * "+i+" = "+num);
        }

    }
}

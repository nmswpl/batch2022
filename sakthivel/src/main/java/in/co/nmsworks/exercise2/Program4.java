package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program4
{
    public static void multiplicationTable()
    {
        int num=10;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number : ");
            int value= sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                System.out.println(value+"*"+i+"="+value*i);
            }
    }

    public static void main(String[] args)
    {
        multiplicationTable();

    }
}

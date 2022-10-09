package in.co.nmsworks.training.exercise;

import java.util.Scanner;

public class Program1
{
    public static void EnterNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("you entered no is : " + a);


    }

    public static void main(String[] args)
    {
        EnterNum();

    }
}

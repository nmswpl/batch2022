package in.co.nmsworks.exercise1;
import java.util.Scanner;

//Write a Program to Add Two Integers.

public class problem2
{
    public static void main(String[] args)
    {
        int   n1, n2, n3;
        System.out.println("Enter Two Numbers :");
        Scanner values = new Scanner(System.in);


        n1 = values.nextInt();
        n2 = values.nextInt();
        n3 = n1 + n2;
        System.out.println("Total = " + n3);
    }
}

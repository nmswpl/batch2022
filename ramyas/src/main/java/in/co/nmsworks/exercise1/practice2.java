package in.co.nmsworks.exercise1;
//Write a Program to Add Two Integers.
import java.util.Scanner;

public class practice2
{
    public static void main(String[] args)
    {
        System.out.println("ENTER TWO NUMBERS: ");

        Scanner a = new Scanner(System.in);
        int no1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        int no2 = b.nextInt();

        System.out.println("The Sum is: "+(no1+no2));


    }
}

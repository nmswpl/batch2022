package in.co.nmsworks.excersise2;


// Given an array of integers and int x, Write a Program to print no of occurance of x in the array
import java.util.Scanner;

public class NumberOfOccurance
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 2, 3, 2, 2, 3};
        System.out.println("Enter the number :");
        int x=sc.nextInt();sc.nextLine();
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if (x==arr[i])
            {
                count++;
            }
        }
        System.out.println("Output :" + count);
    }
}

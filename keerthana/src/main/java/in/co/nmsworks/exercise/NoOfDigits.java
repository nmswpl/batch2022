/*
18. Count Number of Digits in an Integer using while loop
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class NoOfDigits
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        int no=input.nextInt();
        int count=0;
        while(no!=0)
        {
            no=no/10;
            count++;
        }
        System.out.println("Number of Digits:"+count);
    }
}

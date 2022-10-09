package in.co.nmsworks.excersise;

import java.util.Scanner;

public class NumberOfDigitsInInteger
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the nuber");
        int number = s.nextInt();
        int  count=0;
        while (number!=0)
        {
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}

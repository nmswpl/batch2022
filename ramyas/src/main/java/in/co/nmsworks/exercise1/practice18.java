package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Count Number of Digits in an Integer using while loop
public class practice18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int no = sc.nextInt();
        int count = 0;
        while (no!=0)
        {
            no /= 10;
            count++;
        }
        System.out.println("NO OF DIGITS: "+count);
    }
}

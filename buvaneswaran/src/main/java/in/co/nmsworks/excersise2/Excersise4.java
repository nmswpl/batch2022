package in.co.nmsworks.excersise2;

import java.util.Scanner;

public class Excersise4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int no=sc.nextInt();sc.nextLine();
        int[] a={10,6,8};
        for (int i=0;i<a.length;i++)
        {
            if(no==a[i])
            {
                System.out.println("Output =" + i);
                break;
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}

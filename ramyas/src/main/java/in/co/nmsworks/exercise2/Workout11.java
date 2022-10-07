package in.co.nmsworks.exercise2;

import java.util.Scanner;

//Write a program to print the biggest of the 3 numbers
//E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
public class Workout11
{
    public static void main(String[] args)
    {
        System.out.println("ENTER 3 NOS : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("BIGGEST NO IS "+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("BIGGEST NO IS "+b);
        }
        else
        {
            System.out.println("BIGGEST NO IS "+c);
        }
    }
}

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Problem7
{
    public static void postiveOrNegative()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int a= sc.nextInt();
        if(a>0)
        {
            System.out.println("Number is Positive");
        }
        else if(a<0)
        {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }

    }

    public static void main(String[] args) {
        postiveOrNegative();

    }
}

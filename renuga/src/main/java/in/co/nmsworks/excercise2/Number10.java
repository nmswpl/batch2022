package in.co.nmsworks.excercise2;

/*10.Write a program to print all numbers between 200 and 500 ending with 7.*/

import java.util.Scanner;

public class Number10 {
    public static void main(String ar[])
    { int i;
        System.out.println("No. divisible by 7 in between 100 and 200");
        for(i=200;i<=500;i++)
        {
            if(i%7==0)
                System.out.print(i +" , ");
        }
    }
}

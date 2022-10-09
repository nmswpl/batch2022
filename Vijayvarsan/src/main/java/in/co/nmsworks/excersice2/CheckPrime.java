package in.co.nmsworks.excersice2;

import java.util.Scanner;

public class CheckPrime {
    //20. Given an integer x, Write a Program to check whether x is Prime or not ?
    //E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CHECK PRIME OR NOT");
        int value= scan.nextInt();
        int flag=0;
        for(int i=2;i<value/2;i++)
        {
            if (value%i==0)
            {
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("ITS A PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");

    }
}

package in.co.nmsworks.excercise1;

import java.util.Scanner;

/* 9.Write a program to Find Largest Among three numbers using if..else statement*/

public class Largest9 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number ");
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && b>c ){
            System.out.println("The largest number is : " + a);
        }
        else if(b>c){
            System.out.println("The largest number is : " +b);
        }
        else
        {
            System.out.println("The largest number is : "+c);
        }
    }
}




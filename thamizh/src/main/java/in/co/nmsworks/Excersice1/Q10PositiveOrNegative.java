package in.co.nmsworks.Excersice1;

import java.util.Scanner;


    //10. Write a program to Check if a Number is Positive or Negative using if else


public class Q10PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number (+ or -)");
        int a= in.nextInt();

        if(a<0)
        {
            System.out.println(a+" is negative");
        } else if (a==0) {
            System.out.println("you entered zero");


        }
        else {
            System.out.println(a+" is positive");
        }
    }
}

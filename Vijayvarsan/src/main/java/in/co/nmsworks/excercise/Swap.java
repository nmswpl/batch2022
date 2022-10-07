package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Swap {
    //6. Write a program to Swap two numbers using temporary variable
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("swap two numbers");
        System.out.println("enter 1st value");
        int first= scan.nextInt();

        System.out.println("enter 2st value");
        int second = scan.nextInt();
        
        System.out.println("before swap " +"first is= " + first + "\nsecond is = " +second);
        System.out.println("after swap using third variable");

        int tv=first;
        first=second;
        second=tv;
        System.out.println("1st value= " + first+"\n2nd value= "+second);
    }
}
